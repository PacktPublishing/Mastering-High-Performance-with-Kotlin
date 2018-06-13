package mastering.kotlin.performance.chapter2.benchmarking.example1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MyBenchmark {

    @Benchmark
    public void testMethod() {
        int a = 3;
        int b = 4;
        int c = a + b;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .forks(1)
                .measurementIterations(1)
                .mode(Mode.AverageTime)
                .build();

        new Runner(opt).run();
    }
}
