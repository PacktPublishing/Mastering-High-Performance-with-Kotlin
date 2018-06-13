package mastering.kotlin.performance.chapter3

class Tea

class Coffee

class Cup<out T>(val drink: T)

fun main(vars: Array<String>) {

    val cupOfTea = Cup(Tea())

    val cupOfCoffee = Cup(Coffee())
}