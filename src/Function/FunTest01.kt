// 정수 2개를 입력 받아 더 큰 수를 리턴하는 max() 함수를 간략식으로 구현하기
fun max(a:Int, b:Int) = if (a > b) a else b
fun main() {
    print("정수1 입력 >> ");    var a = readln().toInt()
    print("정수2 입력 >> ");    var b = readln().toInt()
    println("$a 와 $b 중 더 큰 수 = ${max(a, b)}")
}