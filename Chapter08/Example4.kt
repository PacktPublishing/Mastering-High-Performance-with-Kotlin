package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {
    val value: Char? = args[0].elementAtOrNull(0)
    if (value in 0.toChar()..10.toChar()) {
        println(value)
    }
}