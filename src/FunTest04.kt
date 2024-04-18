fun discount(price: Int, grade: String = "4") : Any {
    var result = (price * 0.95).toInt()
    when (grade) {
        "1 "-> {
            println("Silver 10% 할인")
            result = (price * 0.9).toInt()
        }
        "2" -> {
            println("Gold 20% 할인")
            result = (price * 0.8).toInt()
        }
        "3" -> {
            println("Silver 30% 할인")
            result = (price * 0.7).toInt()
        }
        else -> println("(S, G, V)등급 이외는 기본등급으로 5%로 할인입니다.")
    }
    return result
}
fun main() {
    print("구매 금액 입력 >> ")
    var price = readln().toInt()
    print("등급 입력 (1) S = 실버, (2) G = 골드, (3) V = VIP, (4) 일반 >> ")
    var grade:String = readln()
    println("할인된 가격 = ${discount(price, grade)}")
}