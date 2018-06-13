package mastering.kotlin.performance.chapter1.memoryLeak.mutableKey

fun main(vars: Array<String>) {

    data class MutableKey(var name: String? = null)

    val key = MutableKey("someName")

    val map = HashMap<MutableKey, Int>()
    map[key] = 2

    key.name = "anotherName"

    print(map[key])
}