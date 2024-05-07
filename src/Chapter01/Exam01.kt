package Chapter01

var name:String = "Kotlin"      // var : 변수
val age:Int = 20                // val : 읽기 전용 변수 (런타임시에 할당)

lateinit var dept:String
val deptLength:Int by lazy {
    dept.length             // textLength = text.Length라는 뜻. textLength에 값이 안 정해졌기 때문에 lazy를 씀
}
fun main() {
    println("이름 = $name")
    println("나이 = ${age + 1}")

    dept = "컴퓨터공학"
    println("학과 = $dept")
    println("학과명길이 = " + deptLength)
}