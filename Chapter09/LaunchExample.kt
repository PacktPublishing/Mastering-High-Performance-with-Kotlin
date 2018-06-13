package mastering.kotlin.performance.chapter9

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        val suspendLambda = suspend {
            delay(1, TimeUnit.SECONDS)
            println("Hello from suspend lambda")
        }
        suspendLambda()
    }
    job.join()
}