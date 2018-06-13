package mastering.kotlin.performance.chapter6

data class Point(@JvmField var x: Int = 0, @JvmField var y: Int = 0) {
    var isTranslated = false
    fun translate(dx: Int, dy: Int) {
        this.x += dx
        this.y += dy
        this.isTranslated = true
    }
}