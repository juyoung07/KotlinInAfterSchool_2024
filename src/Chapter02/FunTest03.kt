package Chapter02

fun sum(a: Int, b: Int, op: String): Int {
    var result = 0
    when (op) {
        "+" -> result = a + b
        "-" -> result = a - b
        "*" -> result = a * b
        "/" -> {
            if (b != 0)
                result = a / b
            else println("0으로 나눌 수 없습니다.")
        }
        else -> println("+ - * / 연산자만 입력하세요")
    }
    return result
}

fun main() {
    print("숫자 1 >> ")
    var a = readln().toInt()
    print("숫자 2 >> ")
    var b = readln().toInt()
    print("연산자 >> ")
    var op = readln()
    println("$a + $b = ${sum(a, b, op)}")
}