package mastering.kotlin.performance.chapter8

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.infra.Blackhole


open class Benchmarks3 {

    @State(Scope.Thread)
    open class MyState {
        val value = 3;
    }

    @Benchmark
    fun benchmark1(blackhole: Blackhole, state: MyState) {
        val range = 0..10

        if (state.value in range) {
            blackhole.consume(state.value)
        }

        if (state.value in range) {
            blackhole.consume(state.value)
        }
    }

    @Benchmark
    fun benchmark2(blackhole: Blackhole, state: MyState) {

        if (state.value in 0..10) {
            blackhole.consume(state.value)
        }

        if (state.value in 0..10) {
            blackhole.consume(state.value)
        }
    }
}