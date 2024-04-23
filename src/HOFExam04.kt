fun sump(x: Int, y: Int) = x + y
fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun main() {
    funcParam(3, 2, ::sump)
}