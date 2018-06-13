package mastering.kotlin.performance.chapter5

inline fun <reified T> List<T>.foreach(crossinline invoke: (T) -> Unit): Unit {
    val size = size
    var i = 0
    while (i < size) {
        invoke(get(i))
        i ++
    }
}