package mastering.kotlin.performance.chapter6.constants

import mastering.kotlin.performance.chapter6.Point

val point = Point()
const val compileTime: Int = 5
fun compileTimeFunction() = compileTime + compileTime
