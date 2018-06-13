package mastering.kotlin.performance.chapter2.benchmarking.example5;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class MyBenchmark {

    double x1 = Math.PI;
    double x2 = Math.PI * 2;

    @Benchmark
    public double baseline() {
        return Math.log(x1);
    }

    @Benchmark
    public double measureWrong() {
        Math.log(x1);
        return Math.log(x2);
    }

    @Benchmark
    public double measureRight_1() {
        return Math.log(x1) + Math.log(x2);
    }

    @Benchmark
    public void measureRight_2(Blackhole bh) {
        bh.consume(Math.log(x1));
        bh.consume(Math.log(x2));
    }

}
