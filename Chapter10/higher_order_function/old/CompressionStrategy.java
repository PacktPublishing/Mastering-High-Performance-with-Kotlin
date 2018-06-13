package mastering.kotlin.performance.chapter10.higher_order_function.old;

import java.io.File;

public interface CompressionStrategy {
    File compress(File original);
}
