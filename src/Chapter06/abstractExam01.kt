package Chapter06

open class Human {
    open fun sleep() {}
    open fun eat() {}
}

open abstract class Teacher : Human() {
    abstract fun studyKotlin()
    override fun sleep() = println("need to sleep")
    fun learnJava() = println("learn Java")
}

class Professor : Teacher() {
    override fun studyKotlin() = println("easy kotlin")
}

fun main() {
    var p = Professor()
    p.sleep()
    p.learnJava()
    p.studyKotlin()
}