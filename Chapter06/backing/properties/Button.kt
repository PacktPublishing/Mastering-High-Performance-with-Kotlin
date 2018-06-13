package mastering.kotlin.performance.chapter6.backing.properties

class Button {

    private var _text: String? = null
    var text: String
        set(value) {
            println(value)
            _text = value
        }
        get() {
            return _text + _text
        }

 //  var backgroundColor: Int? = null

 //   var onClickListener: ((Button) -> Unit)? = null

    fun printText() {
        println(_text)
    }

}