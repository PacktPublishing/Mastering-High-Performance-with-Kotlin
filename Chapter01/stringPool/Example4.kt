package mastering.kotlin.performance.chapter1.stringPool

fun main(vars: Array<String>) {
    val cat1 = "Cat"
    val cat2 = cat1.plus("Dog")
    println(cat1)
    println(cat2)
    println(cat1 === cat2)
    println(cat1 === cat1)
}