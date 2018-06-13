//
//@file:JvmName("Example")
//
//package mastering.kotlin.performance.chapter6.companion
//
//@JvmField
//var prevId = -1
//
//class Example private constructor() {
//
//    private var id: Int? = null
//
//    companion object {
//
//        @JvmStatic
//        fun newInstance(): mastering.kotlin.performance.chapter6.companion.Example {
//            val main = Example()
//            main.id = ++prevId
//            return main
//        }
//    }
//}
