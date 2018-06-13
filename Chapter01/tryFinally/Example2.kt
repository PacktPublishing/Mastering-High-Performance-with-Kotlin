package mastering.kotlin.performance.chapter1.tryFinally

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader

fun readFirstLine2() : String? {
    var fileInputStream: FileInputStream? = null
    var inputStreamReader: InputStreamReader? = null
    var bufferedReader: BufferedReader? = null
    return try {
        fileInputStream = FileInputStream("input.txt")
        inputStreamReader = InputStreamReader(fileInputStream)
        bufferedReader = BufferedReader(inputStreamReader)
        bufferedReader.readLine()
    } catch (e: Exception) {
        null
    } finally {
        fileInputStream?.close()
        inputStreamReader?.close()
        bufferedReader?.close()
    }
}

fun main(args: Array<String>) {
    println(readFirstLine2())
}