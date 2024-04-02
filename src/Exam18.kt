fun main() {
    print("나이를 입력하세요 >> ")
    var age: Int
    var ageRange: String
    try {
        age = readln().toInt()
        ageRange = if(age in 10 .. 18)
                "청소년"
            else if(age in 19 .. 29)
                "청년"
            else if(age in 30 .. 49)
                "청년"
            else if(age in 50 .. 64)
                "청년"
            else if(age >= 65)
                "청년"
            else
                "잘못 입력함티비"

        println("$age 세는 $ageRange 입니다.")
    } catch (e: Exception) {
        println("null")
    }
}