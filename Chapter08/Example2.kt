package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {
    val value = args[0].toDouble()
    if (value in 0.0..10.0) {
        println(value)
    }
}