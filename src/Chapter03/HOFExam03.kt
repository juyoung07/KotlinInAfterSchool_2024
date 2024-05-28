package Chapter03

fun square(a: Int, p: (Int) -> (Int)) {
    println("$a -> ${p(a)}")
}
fun main() {
    square(2, {a -> a * a})     // 고차함수 람다식 매개변수 타입이 명시된 경우 타입 생략 가능
    square(2) {a -> a * a}      // 마지막 인자가 람다식 -> 소괄호 밖으로 뺄 수 있다.
    square(2) {it * it}         // 매개변수가 1개인 경우 it 사용 가능
}