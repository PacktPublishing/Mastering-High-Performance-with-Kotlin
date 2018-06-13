package mastering.kotlin.performance.chapter1.stringPool

import java.io.File

val firstLine: String
    get() = File("input.txt")
            .inputStream()
            .bufferedReader()
            .use { it.readLine() }

fun main(vars: Array<String>) {
    println(firstLine === firstLine)
}