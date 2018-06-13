package mastering.kotlin.performance.chapter2.benchmarking.example6;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class MyBenchmark {

    @State(Scope.Thread)
    public static class MyState {
        int a = 3;
        int b = 4;
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int testMethod(MyState state) {
        return state.a + state.b;
    }

}
