package mastering.kotlin.performance.chapter9

import io.reactivex.*
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import kotlinx.coroutines.experimental.rx2.await
import kotlinx.coroutines.experimental.rx2.rxMaybe
import java.util.concurrent.TimeUnit
import kotlin.coroutines.experimental.*

class Bakery {
    fun order(amountOfCakes: Int): List<Cake> {
        val cakes = mutableListOf<Cake>()
        val baker = Baker()
        val bakingTask = Runnable {
            cakes.add(baker.bake())
        }
        for (i in 0 until amountOfCakes) {
            bakingTask.run()
        }
        return cakes
    }

    fun fastOrder(amountOfCakes: Int): List<Cake> {
        val cakes = mutableListOf<Cake>()
        val baker = Baker()
        val countDownLatch = CountDownLatch(amountOfCakes)
        val bakingTask = Runnable {
            cakes.add(baker.bake())
            countDownLatch.countDown()
        }
        val executor = Executors.newFixedThreadPool(amountOfCakes)
        for (i in 0 until amountOfCakes) {
            executor.execute(bakingTask)
        }
        executor.shutdown()
        countDownLatch.await()
        return cakes
    }

    fun reactiveOrder(amountOfCakes: Int): Single<List<Cake>> {
        val baker = Baker()
        return Observable.range(0, amountOfCakes)
                .flatMapSingle { baker.singleBake() }
                .toList()
    }

    suspend fun coroutinesOrder(amountOfCakes: Int): List<Cake> {
        val baker = Baker()
        return (0 until amountOfCakes)
                .map { async { baker.bake() } }
                .map { it.await()}
    }

    fun coroutinesSequenceOrder(amountOfCakes: Int) = buildSequence {
        val baker = Baker()
        (0 until amountOfCakes)
                .forEach { yield(baker.bake()) }
    }.toList()

    suspend fun coroutinesSuspendingSequenceOrder(amountOfCakes: Int) = suspendingSequence {
        (0 until amountOfCakes)
                .map { async { Baker().bake() } }
                .forEach { yield(it.await()) }
    }.iterator().toList()

    suspend fun coroutinesProducerOrder(amountOfCakes: Int) = produce<Cake> {
        (0 until amountOfCakes)
                .map { async { Baker().bake() } }
                .forEach { send(it.await()) }
    }.toList()

    suspend fun rxToCoroutinesOrder(amountOfCakes: Int): List<Cake> {
        return reactiveOrder(amountOfCakes).await()
    }
}

//fun main(args: Array<String>) = runBlocking {
//    val cakes = Bakery().rxToCoroutinesOrder(10)
//    println("Number of cakes: ${cakes.size}")
//}


//suspend fun sendString(channel: SendChannel<String>, s: String, time: Long) {
//   // while (true) {
//    //    delay(time)
//        channel.send(s)
//   // }
//}
//
//fun main(args: Array<String>) = runBlocking<Unit> {
//    val channel = Channel<String>()
//   // println(channel.toList())
//
//    launch { sendString(channel, "foo", 200L) }
//    launch { sendString(channel, "BAR!", 500L) }
//}

//fun main(args: Array<String>) = runBlocking {
//    val cakes = Bakery().coroutinesOrder(10)
//    println("Number of cakes: ${cakes.size}")
//}


fun main(args: Array<String>) = runBlocking {
    val cakes = Bakery().coroutinesOrder(amountOfCakes = 10)
    println("Number of cakes: ${cakes.size}")
}

//fun main(args: Array<String>) {
//     val cakes = Bakery().fastOrder(amountOfCakes = 10)
//     println("Number of cakes: ${cakes.size}")
//}

//fun main(args: Array<String>) {
//    Bakery().reactiveOrder(10)
//            .toObservable()
//            .blockingSubscribe { cakes -> println("Number of cakes: ${cakes.size}")  }
//}