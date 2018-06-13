package mastering.kotlin.performance.chapter7.delegation.kotlin.singleton

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

object SingletonDelegate : ReadOnlyProperty<Any?, String?> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        return property.name
    }
}

class Main {
    val property by SingletonDelegate
    val another by SingletonDelegate
}

fun main(args: Array<String>) {
    println(Main().property)
}