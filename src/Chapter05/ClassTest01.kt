package Chapter05

class Circle (var name: String = "피자", var radius: Int = 1) {
    // 파이 선언
    val PI = 3.14
    fun area() = println("${name}의 넓이 : ${(radius * radius) * PI}")     // 원의 넓이 출력하는 함수
    fun around() = println("${name}의 둘레 : ${(2 * radius * PI)}")        // 원의 둘레 출력하는 함수
    fun show() = println("${name}의 반지름 $radius")                        // 원의 이름과 반지름 출력하는 함수
}
fun main() {
    val circle1: Circle = Circle("도넛", 10)
    circle1.show()
    circle1.area()

    val circle2: Circle = Circle("피자", 50)
    circle2.show()
    circle2.around()
}