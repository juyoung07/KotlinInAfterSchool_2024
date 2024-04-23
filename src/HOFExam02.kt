fun sumC(a: Int, b: Int): Int = a + b       // {a, b -> a + b} 이렇게 넘겨짐

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int) = operation(a, b)

fun a(str: String): String {
    return str
}

fun b(funs: (String) -> String) {
    println(funs("awds"))
}
fun main() {
    b(::a)          // 고차함수 호출: 사용할 함수를 매개변수로 넘겨줌 -> ::(함수포인터) 활용
    println(calc(2, 1, ::sumC))
}