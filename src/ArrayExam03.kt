fun main() {
    var names = arrayOfNulls<String>(4)
    names[0] = "Kim"
    names.set(1, "Kang")

    var n0 = names[0]
    var n1 = names.get(1)
    println("$n0, $n1")
}