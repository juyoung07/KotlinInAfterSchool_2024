package Chapter02

// while 응용 종합 실습: 다양한 입력 체크
fun main() {
    while (true) {
        print("데이터 타입 선태 [1) Int, 2) String, 3)종료] >> ")
        var dType = readln().toInt()

        // 3을 선택했을 때
        if (dType == 3) {
            println("종료합니다.")
            break
        }
        var n:Any

        // 1을 선택했을 때
        if (dType == 1) {
            print("Int 데이터 입력 (1 ~ 100) >> ")
            n = readln().toInt()
        }

        // 2를 선택했을 때
        else if (dType == 2) {
            print("String 데이터 입력 (cat, dog) >> ")
            n = readln()
        }
        else
            n = "other"

        when (n) {
            in 1..100 -> println("Int")
            "dog", "cat" -> println("String")
            !is String -> println("String 아님")
            else -> println("입력 오류! 다시 선탹하세요.")
        }
    }
}