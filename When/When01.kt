// when은 자바의 switch-case 문과 동일
fun main() {
    val a2 = 1
    when (a2) {
        1 -> println("a2는 1")
        2 -> println("a2는 2")
        3, 4 -> println("a2는 3또는 4")
        else -> {println("a2 is neither 1 nor 2")}
    }

    val data1 = "hello"
    when (data1) {
        "hello" -> println("data1 is hello")
        "world" -> println("data1 is world")
        else -> println("data1 is not hello or world")
    }

    var hour = 10
    when {
        hour < 12 -> println("오전")
        hour >= 12 && hour < 6 -> println("오후")
        else -> println("저녁")
    }
}