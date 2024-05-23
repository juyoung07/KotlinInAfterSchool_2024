import Chapter05.Birds

class Bird(var name:String = "noName", var wing:Int = 2, var color:String = "white") {
    init {
        println("** Bird 만들기 **")
    }
    fun print() = println("$name, $wing, $color")
    fun fly() = println("Flying wing")
    fun sing(vol:Int) = println("Singing vol: $vol")
}
fun main() {
    val coco1: Bird = Bird("coco1", 2, "red")
    coco1.print()
    coco1.fly()
    coco1.sing(2)

    val coco2 = Bird("coco2")
    coco2.print()
    coco2.sing(4)
}