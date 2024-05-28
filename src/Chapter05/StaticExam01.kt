package Chapter05

class MyClass {
    var name: String = "world"
    fun sayHello() {
        num++
        println("$num : hello $name")
    }
    companion object {
        var num: Int = 0
    }
}
fun main() {
    val obj1 = MyClass()
    val obj2 = MyClass()

    obj1.sayHello()
    obj2.sayHello()
    println("개수: " + MyClass.num)
}