package mastering.kotlin.performance.chapter1.stringPool

fun main(vars: Array<String>) {
    println(firstLine.intern() === firstLine.intern())
}