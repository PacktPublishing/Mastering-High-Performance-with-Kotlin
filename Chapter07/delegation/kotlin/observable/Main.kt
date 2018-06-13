package mastering.kotlin.performance.chapter7.delegation.kotlin.observable

import kotlin.properties.Delegates

var subject: String by Delegates.observable("init value") {
    property, old, new ->
    println("$old -> $new")
}

var maxLength: String by Delegates.vetoable("init value") {
    property, oldValue, newValue ->
    newValue.length > oldValue.length
}