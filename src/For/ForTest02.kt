// 이중 for문을 이용한 랜덤 로또 번호 생성 프로그램
fun main() {
    val data_range:IntRange = 1..45
    var data:Int = data_range.random()

    println("** 로또 번호 생성을 시작합니다 **")
    print("몇 장을 뽑을까요? >> ")
    var input = readln().toInt()

    for (i in 1..input) {
        print("자동 번호 --> ")
        for (j in 1..6)
            print("${data_range.random()} ")
        println()
    }
}