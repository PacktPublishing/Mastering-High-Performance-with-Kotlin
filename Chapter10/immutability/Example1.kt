package mastering.kotlin.performance.chapter10.immutability

fun main(vars: Array<String>) {
    data class ImmutableKey(val name: String? = null)
    val key = ImmutableKey()
    val copiedKey = key.copy()
    val copiedKeyWithAnotherName = key.copy(name = "AnotherName")
    println(key === copiedKey)
    println(key === copiedKeyWithAnotherName)
    println(key == copiedKey)
    println(key == copiedKeyWithAnotherName)
}