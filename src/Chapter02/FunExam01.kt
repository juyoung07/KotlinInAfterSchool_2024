package Chapter02

fun sumBasic(a:Int, b:Int) : Int {
    return a + b
}
fun sum(a:Int, b:Int) = a + b   // 단일 표기식
fun main() {
    print("정수1 입력 >> ");    var x = readln().toInt()
    print("정수2 입력 >> ");    var y = readln().toInt()
    println("$x + $y = ${Chapter03.sum(x, y)}")

    var result = Chapter03.sum(1, 2)
    println("1 + 2 = $result")
}