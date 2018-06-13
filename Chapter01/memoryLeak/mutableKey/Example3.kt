package mastering.kotlin.performance.chapter1.memoryLeak.mutableKey

fun main(vars: Array<String>) {
    data class ImmutableKey(val name: String? = null)
    val map = HashMap<ImmutableKey, Int>()
    map[ImmutableKey("someName")] = 2
    print(map[ImmutableKey("someName")])
}