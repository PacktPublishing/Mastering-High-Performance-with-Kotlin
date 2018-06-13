package mastering.kotlin.performance.chapter9

import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.SECONDS)
open class Benchmarks {

    @Benchmark
    fun order() = Bakery().order(amountOfCakes = 10)

    @Benchmark
    fun fastOrder() = Bakery().fastOrder(amountOfCakes = 10)

}