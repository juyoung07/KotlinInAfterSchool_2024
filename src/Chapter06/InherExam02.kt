package Chapter06

open class Bird2(var name: String = "noName", var wing: Int = 2, var color: String = "white") {
    fun print() = println("$name, $wing, $color")
    fun fly() = println("Flying wing")
    open fun sing(vol: Int) = println("Singing vol: $vol")      // 오버라이딩 가능한 메소드
}

class Lark2(name: String, wing: Int, color: String) : Bird2(name, wing, color) {      // 주생성자에서 부모생성자 호출
    fun singHighTone() = println("Happy Song")
}

class Parrot2 : Bird2 {
    val language: String

    constructor(name: String, wing: Int, color: String, language: String) : super(
        name,
        wing,
        color
    ) {  // 부생성자에서 부모생성자 호출
        this.language = language
    }

    fun speak() = println("Speak $language")

    override fun sing(vol: Int) {
        super.sing(vol)
        println("Im a parrot, the volume level is $vol")
        speak()
    }
}

fun main() {
//    val lark = Lark2("종달새", 2, "회색")
//    val parrot = Parrot2("앵무새", 2, "빨강", "한국어")
//
//    lark.print()
//    lark.fly()
//    lark.sing(2)
//    lark.singHighTone()
//    println()
//    parrot.print()
//    parrot.speak()
//    parrot.sing(4)
    var birdArr: ArrayList<Bird2> = ArrayList()
    birdArr.add(Lark2("종달새", 2, "회색"))
    birdArr.add(Parrot2("앵무새", 2, "빨강", "한국어"))

    for (i in birdArr) {
        i.print(); i.fly(); i.sing(2);
        if (i is Lark2) i.singHighTone() // is는 instanceOf와 같음. 다운캐스팅
        println()
    }
    var b = birdArr.get(0) as Lark2     // 다운 캐스티 (강제 형변환)
    b.singHighTone()
}