package mastering.kotlin.performance.chapter1.memoryLeak.mutableKey

fun main(vars: Array<String>) {

    class MutableKey(var name: String? = null)

    val map = HashMap<MutableKey, Int>()
    map[MutableKey("someName")] = 2
    print(map[MutableKey("someName")])
}