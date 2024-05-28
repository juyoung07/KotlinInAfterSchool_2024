class Bird4(var name: String = "noName", var wing: Int = 2, var color: String = "white") {
    companion object {
        var num: Int = 0
    }

    init {
        println("** Bird4 만들기 **")
        num++
    }

    lateinit var food: String

    constructor(name: String, wing: Int, color: String, food: String) : this(name, wing, color) {
        this.food = food
    }

    fun print() = println("$name, $wing, $color")
    fun fly() = println("Flying wing")
    fun sing(vol: Int) = println("Singing vol: $vol")
    fun food() = println("food = $food")
}

fun main() {
    val coco1: Bird4 = Bird4()
    val coco2: Bird4 = Bird4()
    val coco3: Bird4 = Bird4()
    println("새의 수: ${Bird4.num}")
}