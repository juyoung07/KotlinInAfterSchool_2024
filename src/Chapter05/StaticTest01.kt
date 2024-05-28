package Chapter05

class Card(var kind: String = "Spade", var num: Int = 1) {
    companion object {
        var width: Int = 100
        var height: Int = 250

        fun showSize() = println("카드의 폭은: $width, 높이는 $height")
    }

    fun show(name: String) {
        println("${name} >> 무늬 : $kind 값 : $num")
    }
}

fun main() {
    Card.showSize()
    var c1 = Card("Heart", 7)
    var c2 = Card()
    c1.show("c1")
    c2.show("c2")

    Card.width = 50
    Card.height = 80
    Card.showSize()


}