package mastering.kotlin.performance.chapter1.tryFinally

import java.io.File

fun readFirstLine3(): String? = File("input.txt")
        .inputStream()
        .bufferedReader()
        .use { it.readLine() }

fun main(args: Array<String>) {
    println(readFirstLine3())
}