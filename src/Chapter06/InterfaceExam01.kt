package Chapter06

interface Person {
    var age: Int
    fun needToSleep()
    fun getName(): String = "kotlin"
}

interface School {
    fun showSchool()
}

interface Bus : School {
    fun showBus()
}

class Student : Person, Bus {
    override fun needToSleep() {}
    override fun getName(): String = "easy ketlin"
    override fun showSchool() {}
    override fun showBus() {}
    override var age: Int = 17
    fun newFun() {
        age++; println("${age} is +1 ")
    }
}

fun main() {
    var s: Student = Student()
    s.newFun()
    println(s.getName())
}