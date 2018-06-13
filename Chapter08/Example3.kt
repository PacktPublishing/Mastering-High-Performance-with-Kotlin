package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {
    val value = args[0].toIntOrNull()
    if (value in 0..10) {
        println(value)
    }
}