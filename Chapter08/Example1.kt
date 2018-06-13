package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {

    val int = args[0].toInt()

    if (int in 0..10) {
        println(int)
    }
}