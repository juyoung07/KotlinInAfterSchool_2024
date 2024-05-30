package Chapter05

data class UserData(val name: String, var age: Int)

fun main() {
    var userData = UserData("Michael", 21)
    println(userData.toString())

    var newUser = userData.copy()
    println(newUser.toString())
}