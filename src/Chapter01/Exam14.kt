package Chapter01

fun main() {
    var num1 = 10
    var num2 = 10
    val result1 = ++num1
    val result2 = num2++

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")

    val number1 = 12
    val number2 = 25

    println(number1 > 20 || number2 > 20)
    println(number1 or number2)             // 비트 연산
    // result = number1.or(number1)와 동일

    println(number1 > 20 && number2 > 20)
    println(number1 and number2)            // 비트 연산
    // result = number1.and(number1)와 동일

    println(number1 xor number2)    // 비트 연산
    // result = number1.xor(number1)와 동일
}