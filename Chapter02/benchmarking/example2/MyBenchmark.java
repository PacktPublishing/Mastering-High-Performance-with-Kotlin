package mastering.kotlin.performance.chapter2.benchmarking.example2;

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
    public void testMethod(MyState myState) {
        int c = myState.a + myState.b;
    }
}
