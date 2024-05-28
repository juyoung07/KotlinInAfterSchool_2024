package Chapter02

fun main() {
    print("점수를 입력하세요 >> ")
    var score: Int
    var grade: String
    try {
        score = readln().toInt()
        grade = if (score >= 90)
                "A"
            else if (score in 80..90)
                "B"
            else if (score in 70..80)
                "C"
            else if (score in 60..70)
                "D"
            else
                "F"

        println("$score 점은 $grade 입니다.")
    } catch (e: Exception) {
        println("null")
    }
}