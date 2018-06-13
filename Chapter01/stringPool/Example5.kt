package mastering.kotlin.performance.chapter1.stringPool

class User(val id: Int = 0, val firstName: String = "", val lastName: String = "")

fun main(vars: Array<String>) {
    val user = User()
    val building = "304a"

    // val query = "SELECT id, firstName, lastName FROM Building " + building + " WHERE firstName = " + user.firstName
    val query = "SELECT id, firstName, lastName FROM Building $building WHERE firstName = ${user.firstName}"
}