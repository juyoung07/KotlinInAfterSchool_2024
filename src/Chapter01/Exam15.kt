package Chapter01

// 주소.. 참조 연산자. 객체에서만 할 수 있음
fun main() {
    val data1:Int = 10
    val data2:Int = 10
    println("data1 == data2 is ${data1 == data2}")
    println("data1 === data2 is ${data1 === data2}")

    // 기초 데이터 타입의 변수 선언 시 자바의 Wrapper 클래스를 직접 이용해 생성하면 객체가 생성되는 것으로 ==은 값을, ===은 객체를 비교
    println()
    val int1 = Integer(10)                        // 객체 생성
    val int2 = Integer(10)
    val int3 = int1                                     // 같은 레퍼런스 공유
    println("int1 == int2 is ${int1 == int2}")          // 값 비교
    println("int1 === int2 is ${int1 === int2}")        // 레퍼런스 비교
    println("int1 == int3 is ${int1 == int3}")
    println("int1 == int3 is ${int1 == int3}")
}