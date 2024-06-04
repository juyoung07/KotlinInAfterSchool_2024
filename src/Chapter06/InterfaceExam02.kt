package Chapter06

open class People {
    open fun needTosleep() {}
}

open abstract class Student2: People() {
    abstract fun learnKotlin()
    fun learnJava() {}
}

interface Study {
    fun coding(program: String)
    fun study() = println("studying")
}

interface Work {
    fun working()
}

class Worker: Student2(), Study, Work {
    override fun coding(program: String) = println("$program : study")
    override fun learnKotlin() = println("easy kotlin")
    override fun working() = println("working")
}

fun main() {
    var w = Worker()
    w.study()
    w.coding("kotlin")
    w.learnKotlin()
    w.working()
}