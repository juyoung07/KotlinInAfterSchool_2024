package Chapter02

// 음료수 종류와 잔 수를 입력 받으면 가격을 알려주는 프로그램
fun main() {
    println("***** 메뉴판 *****")
    println("   에프 2000원")
    println("   아메 2500원")
    println("   카푸 3000원")
    println("*****************")
    println()
    println("커피를 주문하세요")

    print("커피 종류 >> ")
    var coffee = readln().toString()

    print("잔 수 >> ")
    var cups = readln().toInt()

    when (coffee) {
        "에프" -> println("${2000 * cups}원 입니다.")
        "아메" -> println("${2500 * cups}원 입니다.")
        "카푸" -> println("${3000 * cups}원 입니다.")
        else -> println("잘못 입력하심티비")
    }

//    if (coffee == "에프")
//        println("${2000 * cups}원 입니다.")
//    else if (coffee == "아메")
//        println("${2500 * cups}원 입니다.")
//    else if (coffee == "카푸")
//        println("${3000 * cups}원 입니다.")
//    else
//        println("잘못 입력하심티비")
}