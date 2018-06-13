package mastering.kotlin.performance.chapter4

fun main(args: Array<String>) {
    var counter = 0
    val inc = {
        counter ++
    }
    inc()
}