package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {
    val value = args[0].toLong()
    when(value) {
        in 100L..200L -> println("Informational responses")
        in 200L..300L -> println("Success")
        in 300L..400L -> println("Redirection")
        in 400.0..500.0 -> println("Client error")
        in 500.0..600.0 -> println("Server error")
    }
}