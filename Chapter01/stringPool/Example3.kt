package mastering.kotlin.performance.chapter1.stringPool

fun main(vars: Array<String>) {
    val cat1 = "Cat"
    val cat2 = "Cat"
    val cat3 = String("Cat".toCharArray())

    println(cat1 === cat2)
    println(cat1 === cat3)
}