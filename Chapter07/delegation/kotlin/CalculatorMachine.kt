package delegation.kotlin

import mastering.kotlin.performance.chapter7.delegation.Calculator


class CalculatorMachine(private val delegate: Calculator): Calculator by delegate  {

    fun printDelagateClassName() {
        println(delegate::class.java.simpleName)
    }

}