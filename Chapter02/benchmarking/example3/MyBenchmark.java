package mastering.kotlin.performance.chapter2.benchmarking.example3;

import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
public class MyBenchmark {

    double x;

    @Setup
    public void prepare() {
        System.out.println("prepare");
        x = Math.PI;
    }

    @TearDown
    public void check() {
        System.out.println("check");
        assert x > Math.PI : "Nothing changed?";
    }

    @Benchmark
    public void measureRight() {
        x++;
    }

    @Benchmark
    public void measureWrong() {
        double x = 0;
        x++;
    }
}
