// 화씨를 섭씨로 온도 단위 변환하는 프로그램
fun main() {
    println("화씨를 섭씨로 온도 반위 변환 프로그램")
    print("온도를 입력 >> ")
    var temp = readln().toDouble()

    print("단위를 입력 (F or C) >> ")
    var unit = readln().toUpperCase()       // 대소문자 구분 없앰

    var result: Double

    if (unit == "F") {
        result = (temp - 32) / 1.8
        println("$temp(F)는 ${"%.2f".format(result)}(C)입니다.")
    } else if (unit == "C") {
        result = (temp * 1.8) / 32
        println("$temp(C)는 ${"%.2f".format(result)}(F)입니다.")
    } else println("정상적인 온도 단위가 아닙니다.")


//    내가 작성한 코드

//    // 입력받을 값(온도와 단위)과 반환할 값
//    var temperature: Double
//    var danwe: String
//    var result: Double
//
//    // 온도와 단위 입력 받기
//    print("온도를 입력하세요 >> ")
//    temperature = readln().toDouble()
//    print("단위를 입력하세요 (F or C) >> ")
//    danwe = readln().toString()
//
//    if (danwe == "F") {
//        result = (temperature - 32) / 1.8
//        println("$temperature $danwe 는 ${"%.2f".format(result)}C입니다.")
//    } else if (danwe == "C"){
//        result = (temperature * 1.8) + 32
//        println("$temperature $danwe 는 ${"%.2f".format(result)}F입니다.")
//    } else {
//        println("단위를 잘못 입력하셨습니다.")
//    }
}