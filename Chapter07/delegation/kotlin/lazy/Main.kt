package mastering.kotlin.performance.chapter7.delegation.kotlin.lazy

import java.math.BigInteger

class CacheThread(val lazyValue: BigInteger): Thread() {
    override fun run() {
        super.run()
        Thread.sleep(250)
        println("${this::class.java.simpleName} $lazyValue")
    }
}

class NetworkThread(val lazyValue: BigInteger): Thread() {
    override fun run() {
        super.run()
        Thread.sleep(300)
        println("${this::class.java.simpleName} $lazyValue")
    }
}

val lazyValue by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("computation")
    BigInteger.valueOf(2).modPow(BigInteger.valueOf(7), BigInteger.valueOf(20))
}

fun main(args: Array<String>) {
    CacheThread(lazyValue).start()
    NetworkThread(lazyValue).start()
}