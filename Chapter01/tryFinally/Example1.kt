package mastering.kotlin.performance.chapter1.tryFinally

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader

fun readFirstLine1() : String {
    val fileInputStream = FileInputStream("input.txt")
    val inputStreamReader = InputStreamReader(fileInputStream)
    val bufferedReader = BufferedReader(inputStreamReader)
    return bufferedReader.readLine()
}

fun main(args: Array<String>) {
    println(readFirstLine1())
}