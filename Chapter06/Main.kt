package mastering.kotlin.performance.chapter6

class Main {
    inner class Inner {
        fun printValue() {
            println(value)
        }
    }
    @JvmField
    var value = "Value"
}