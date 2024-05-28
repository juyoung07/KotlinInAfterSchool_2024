package Chapter03

fun sum1(no1: Int, no2: Int): Int {
    return no1 + no2;
}

// 람다식
val mul : (Int, Int) -> Int = {x: Int, y: Int -> print("$x * $y = "); x * y}
val sum2 = {x: Int, y: Int -> x + y}

fun main() {
    println("함수식 : 10 + 20 = ${sum1(10, 20)}")
    println("람다식 : 10 + 20 = ${sum2(10, 20)}")
    println("${mul(10, 20)}")
}