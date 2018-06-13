package mastering.kotlin.performance.chapter1.memoryLeak

import io.reactivex.Observable
import java.util.concurrent.TimeUnit

fun main(vars: Array<String>) {
    var memoryLeak: MemoryLeak? = MemoryLeak()
    memoryLeak?.start()
    memoryLeak = null
    memoryLeak = MemoryLeak()
    memoryLeak.start()
    Thread.currentThread().join()
}

class MemoryLeak {

    init {
        objectNumber ++
    }

    private val currentObjectNumber = objectNumber

    fun start() {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe { println(currentObjectNumber) }
    }

    companion object {
        @JvmField
        var objectNumber = 0
    }
}