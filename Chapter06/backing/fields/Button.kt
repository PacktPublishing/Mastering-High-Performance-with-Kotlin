package mastering.kotlin.performance.chapter6.backing.fields

class Button {

    var text: String = TODO()
        set(value) {
            println(value)
            field = value
        }
        get() {
            return field + field
        }

    var backgroundColor: Int = TODO()

    var onClickListener: ((Button) -> Unit)? = null

}