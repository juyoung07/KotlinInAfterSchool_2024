fun sumC(a: Int, b: Int): Int = a + b       // {a, b -> a + b} 이렇게 넘겨짐
fun calc(a: Int, b: Int, operation: (Int, Int) -> Int) = operation(a, b)
fun a(str: String): String {
    return str
}
fun b(funs: (String) -> String) {
    println(funs("awds"))
}
val sumla = {a: Int, b: Int -> a + b}
fun calculator(a: Int, b: Int, operation: (Int, Int) -> Int) = operation(a, b)

// 고차함수의 인자가 람다식 뿐이면 소괄호 생략
fun printInfo(p: () -> Unit) {
    println("계산 Version: ")
    p()
}

fun main() {
    b(::a)          // 고차함수 호출: 사용할 함수를 매개변수로 넘겨줌 -> ::(함수포인터) 활용
    println(calc(2, 1, ::sumC))

//    println(calculator(2, 1, ::sumla))        // 람다함수는 익명이라 함수포인터 사용 불가능
    println(calculator(2, 1, sumla))
    println(calculator(2, 1) {a: Int, b: Int -> a + b})

    // 함수 호출 시 맨 마지막 인자가 람다식이면 람다식을 소괄호 밖으로 뺄 수 있음
    println(calculator(2, 1) {a: Int, b: Int -> a + b})

    // 호출하는 고차함수에 람다의 매개변수 타입이 명시된 경우 표현식에서 타입 생략
    println(calculator(2, 1) {a, b -> a + b})

    // 고차함수의 인자가 람다식 뿐이면 소괄호 생략
    printInfo ({ println("1.1")})
    printInfo (){ println("1.1")}
    printInfo { println("1.1")}     // 고차함수 호출 -> 소괄호 생략
}