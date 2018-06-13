package mastering.kotlin.performance.chapter8

fun main(args: Array<String>) {
    val value = args[0].toInt()
    when(value) {
        in 100..200 -> println("Informational responses")
        in 200..300 -> println("Success")
        in 300..400 -> println("Redirection")
        in 400..500 -> println("Client error")
        in 500..600 -> println("Server error")
    }
}