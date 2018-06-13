package mastering.kotlin.performance.chapter8

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.infra.Blackhole

open class Benchmarks2 {
    val range = 0..1_000
    val array = Array(1_000) { it }

    @Benchmark
    fun rangeLoop(blackhole: Blackhole)
            = range
            .map { it * 2 }
            .first { it % 2 == 0 }


    @Benchmark
    fun rangeSequenceLoop(blackhole: Blackhole)
            = range.asSequence()
            .map { it * 2 }
            .first { it % 2 == 0 }

    @Benchmark
    fun arrayLoop(blackhole: Blackhole)
            = array
            .map { it * 2 }
            .first { it % 2 == 0 }

    @Benchmark
    fun arraySequenceLoop(blackhole: Blackhole)
            = array.asSequence()
            .map { it * 2 }
            .first { it % 2 == 0 }

}