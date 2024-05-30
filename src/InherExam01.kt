import Chapter03.printInfo
import org.intellij.lang.annotations.Language

open class Bird (var name: String = "noName", var wing: Int = 2, var color: String = "white") {
    fun print() = println("$name, $wing, $color")
    fun fly() = println("Flying wing")
    fun sing(vol: Int) = println("Singing vol: $vol")
}
class Lark(name: String, wing: Int, color: String) : Bird(name, wing, color) {      // 주생성자에서 부모생성자 호출
    fun singHighTone() = println("Happy Song")
}
class Parrot : Bird {
    val language: String
    constructor(name: String, wing: Int, color: String, language: String) : super(name, wing, color) {  // 부생성자에서 부모생성자 호출
        this.language = language
    }
    fun speak() = println("Speak $language")
}

fun main() {
    val coco = Bird(name = "coco", color = "black")
    val lark = Lark("myLark", 2, "red")
    val parrot = Parrot("myParrot", 2, "brown", "korean")

    coco.print()
    lark.print()
    parrot.print()
    parrot.speak()
}