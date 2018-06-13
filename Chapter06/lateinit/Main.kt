package mastering.kotlin.performance.chapter6.lateinit

class Main {
    private lateinit var name: String
    fun onCreate() {
        name = "Jack"
        val name = this.name
        println(name)
        println(name)
    }
}