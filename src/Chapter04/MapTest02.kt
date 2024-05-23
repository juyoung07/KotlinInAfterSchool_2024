package Chapter04

fun main() {
    var icecreamList:MutableMap<String, Int> = mutableMapOf<String, Int>()

    println("아이스크림 이름과 가격을 입력하세요.")
    for (i in 1..5) {
        print("이름, 가격 >> ")
        val (key, number) = readln().split(' ')
        var value : Int = number.toInt()
        icecreamList.put(key, value)
    }

//    var price = 0
//    print("가격 : ")
//    for ((key, value) in icecreamList) {
//        print("${value} ")
//        price += value
//    }

    for (k in icecreamList.keys) print("${k} ")     // forEach 구문
    print("\n가격 : ")
    for (v in icecreamList.values) print("${v} ")

    println("\n아이스크림 총 가격 = ${icecreamList.values.sum()}")

}