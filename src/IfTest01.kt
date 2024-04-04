// 화씨를 섭씨로 온도 단위 변환하는 프로그램
fun main() {
    // 입력받을 값(온도와 단위)과 반환할 값
    var temperature: Double
    var danwe: String
    var result: Double

    // 온도와 단위 입력 받기
    print("온도를 입력하세요 >> "ㅎ)
    temperature = readln().toDouble()
    print("단위를 입력하세요 (F or C) >> ")
    danwe = readln().toString()

    if (danwe == "F") {
        result = (temperature - 32) / 1.8
        println("$temperature $danwe 는 ${"%.2f".format(result)}C입니다.")
    } else if (danwe == "C"){
        result = (temperature * 1.8) + 32
        println("$temperature $danwe 는 ${"%.2f".format(result)}F입니다.")
    } else {
        println("단위를 잘못 입력하셨습니다.")
    }
}