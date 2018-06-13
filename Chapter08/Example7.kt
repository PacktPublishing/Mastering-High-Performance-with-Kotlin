package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {
    val value = args[0].toInt()

    if (value in (0..10).reversed()) {
        println(value)
    }
}