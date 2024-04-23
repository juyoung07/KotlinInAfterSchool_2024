fun main() {
    val upperCase1: (String) -> String = {str:String -> str.toUpperCase()}
    println(upperCase1("hello"))

    val upperCase2: (String) -> String = {str -> str.toUpperCase()}         // 함수타입으로 타입추론
    println(upperCase2("hello"))                                            // 매개변수 자료형 생략

    val upperCase3 = {str:String -> str.toUpperCase()}                      // 함수타입생략
    println(upperCase2("hello"))                                            // 선언 자료형 생략

//    val upperCase4: (String) -> String = {str -> str.toUpperCase()}       // 에러
//    println(upperCase2("hello"))                                          

    val upperCase5: (String) -> String = {it.toUpperCase()}                 // 파라미터가 1개인 경우 it으로 사용
    println(upperCase5("hello"))                                            // 매개변수 자료형, 매개변수 생략

    val upperCase6: (String) -> String = String::toUpperCase                // 일반 함수호출
    println(upperCase6("hello"))
}