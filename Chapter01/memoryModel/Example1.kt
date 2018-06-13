package mastering.kotlin.performance.chapter1.memoryModel

import java.util.concurrent.Executors

fun main(vars: Array<String>) {
    var sharedVariableA = 0
    var sharedVariableB = 0
    val threadPool = Executors.newFixedThreadPool(10)
    val threadA = Runnable {
        sharedVariableA = 3
        sharedVariableB = 4
    }
    val threadB = Runnable {
        val localA = sharedVariableA
        val localB = sharedVariableB
    }
    threadPool.submit(threadA)
    threadPool.submit(threadB)
}