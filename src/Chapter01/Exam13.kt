package Chapter01

fun main() {
    val a:Any = "10"
    val b = a as? Int
    if(b != null)
        println("${b+10}")
    else println(b)
}