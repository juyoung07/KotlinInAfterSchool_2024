// 점수를 입력받아 학점을 출력하는 프로그램
fun main() {
    print("점수를 입력해주세요 >> ")
    var score = readln()!!.toDouble()
    var grade = ""

    when (score) {
        in 90.0..100.0 -> grade = "A"
        in 80.0..89.9 -> grade = "B"
        in 70.0..79.9 -> grade = "C"
        in 60.0..69.9 -> grade = "D"
        else -> grade = "F"
    }
    println("Score: $score, Grade: $grade")
}