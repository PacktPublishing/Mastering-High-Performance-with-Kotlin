package mastering.kotlin.performance.chapter7.delegation.kotlin.generics

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class GenericDelegate<T> : ReadOnlyProperty<Any?, T?> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): T? {
        TODO()
    }
}

class Main {
    val property by IntDelegate()
    val another by GenericDelegate<Float>()
}

class IntDelegate : ReadOnlyProperty<Any?, Int?> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int? {
        TODO()
    }
}