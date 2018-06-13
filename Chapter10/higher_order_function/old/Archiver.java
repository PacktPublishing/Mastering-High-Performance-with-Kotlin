package mastering.kotlin.performance.chapter10.higher_order_function.old;

import java.io.File;

public class Archiver {
    private CompressionStrategy strategy;

    public CompressionStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public File archive(File file) {
        return strategy.compress(file);
    }
}
