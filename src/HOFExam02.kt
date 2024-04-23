fun a(str: String): String {
    return str
}

fun b(funs: (String) -> String) {
    println(funs("awds"))
}
fun main() {
    b(::a)
}