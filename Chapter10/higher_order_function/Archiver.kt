package mastering.kotlin.performance.chapter10.higher_order_function

import java.io.File

fun File.archive(strategy: () -> File): File = strategy()

fun main(args: Array<String>) {
    File("input.txt").archive { TODO() }.also {
        // do something with an archived file
    }
}