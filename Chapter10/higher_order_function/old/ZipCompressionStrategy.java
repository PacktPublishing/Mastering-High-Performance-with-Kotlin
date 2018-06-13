package mastering.kotlin.performance.chapter10.higher_order_function.old;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.io.File;

public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public File compress(File original) {
        throw new NotImplementedException();
    }
}
