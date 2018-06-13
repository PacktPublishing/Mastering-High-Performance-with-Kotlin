package mastering.kotlin.performance.chapter4

fun ex_1() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val odds = ArrayList<Int>()
    for (i in 0..numbers.lastIndex) {
        val item = numbers[i]
        if (item % 2 != 0) {
            odds.add(item)
        }
    }
}

fun ex_2() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val odds = numbers.filter { it % 2 != 0 }
}

fun ex_3() {
    val a = 3
    val b = 5
    val max = if (a > b) a else b
}

fun ex_4() {
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
}