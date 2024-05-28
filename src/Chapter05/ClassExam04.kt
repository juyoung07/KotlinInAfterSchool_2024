package Chapter05

class Bird2 {
    var name: String
    var wing: Int
    var color: String

    constructor(name: String, wing: Int, color: String) {
        this.name = name
        this.wing = wing
        this.color = color
    }

    constructor(name: String, wing: Int) : this(name, wing, color = "grey")

    constructor(name: String) : this(name, wing = 2, color = "grey")

    fun print() = println("$name, $wing, $color")
    fun fly() = println("Flying wing")
    fun sing(vol: Int) = println("Singing vol: $vol")
}

fun main() {
    val coco1 = Bird2("coco", 2, "red")
    coco1.print()
    coco1.fly()
    coco1.sing(2)

    val coco2 = Bird2("coco2", 2)
    coco2.print()
    coco2.fly()
    coco2.sing(2)
}