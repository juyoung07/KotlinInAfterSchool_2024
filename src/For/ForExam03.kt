// 중첩 for문 응용 (줄 수 입력받아 피라미드 모양으로 별찍기)
fun main() {
    print("줄 수 입력 (홀수) >> ")
    val n = readln()!!.toInt()

    for (line in 1..n) {
        for (i in 1..n - line) {
            print(" ")
        }
        for (i in 1..(line * 2) - 1)
            print("*")
        println()
    }
    }
