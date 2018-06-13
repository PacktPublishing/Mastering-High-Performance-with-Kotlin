package mastering.kotlin.performance.chapter8

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.infra.Blackhole

open class Benchmarks1 {
    val range = 0..1_000
    val array = Array(1_000) { it }

    @Benchmark
    fun rangeLoop(blackhole: Blackhole) {
        range.forEach {
            blackhole.consume(it)
        }
    }

    @Benchmark
    fun rangeSequenceLoop(blackhole: Blackhole) {
        range.asSequence().forEach {
            blackhole.consume(it)
        }
    }

    @Benchmark
    fun arrayLoop(blackhole: Blackhole) {
        array.forEach {
            blackhole.consume(it)
        }
    }

    @Benchmark
    fun arraySequenceLoop(blackhole: Blackhole) {
        array.asSequence().forEach {
            blackhole.consume(it)
        }
    }
}