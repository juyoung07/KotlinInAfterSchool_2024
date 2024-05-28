class Card(var name: String, var kind: String = "Spade", var num: Int = 1) {
    companion object {
        var width: Int = 100
        var height: Int = 250

        fun showSize() = println("카드의 폭은: $width, 높이는 $height")
    }

    fun show() {
        println("$name >> 무늬 : $kind 값 : $num")
    }
}

fun main() {
    Card.showSize()
    var c1 = Card("c1","Heart", 7)
    c1.show()
    var c2 = Card("c2S")
    c2.show()
    Card.width = 50
    Card.height = 80
    Card.showSize()


}