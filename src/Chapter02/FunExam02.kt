package Chapter02

fun sayHello (name: String) = println("Hello $name") // 널 허용하지 않음

fun sayHello1 (name: String?) {  // 널 허용
    if (name == null)
        println("Hello!! Korea")
    else
        println("Hello!! " + name)
}

// 매개변수에 디폴트 값을 성정하기, 매개변수가 없을 때 디폴트 값 저장
fun sayHello2 (name: String = "Korea") {
    println("Hello!! " + name)
}

// 명명된 인자(named parameter): 함수를 호출할 때 매개변수의 순서와 상관없이 인자 전달 가능
fun sayHello3 (no: Int, name: String = "Korea") {   // 일반 매개변수를 앞쪽에 먼저 정의
    println("Hello!! " + name)
}

fun main() {
    sayHello1(null)
    sayHello1("Kim")
    sayHello2()
    sayHello2("Kim")
    sayHello3(5)
    sayHello3(no = 10)
    sayHello3(no = 10, name = "Kim")
}