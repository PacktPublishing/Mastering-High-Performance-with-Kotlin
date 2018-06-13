package mastering.kotlin.performance.chapter9

fun main(args: Array<String>) {
    val number = Runtime.getRuntime().availableProcessors()
    println("Number of available processors: $number")
}