package Chapter03

fun main() {
    val res1 = sum(3,2)
    val res2 = mul(sum(3, 3), 3)
    println("res1 = $res1, res2 = $res2")
    println("func: ${func()}")
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b
fun func(): Int {
    return sum(2, 2)
}