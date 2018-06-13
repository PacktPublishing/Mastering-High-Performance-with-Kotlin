package mastering.kotlin.performance.chapter4

import java.io.File

inline fun invokeBlock(body: () -> Unit) {
    try {
        body()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun main(args: Array<String>) {

    val write = {
        val ints = listOf(1, 2, 3, 4, 5)
        File("somefile.txt")
                .writeText(ints.joinToString("\n"))
    }

    invokeBlock(write)

    invokeBlock(write)
}