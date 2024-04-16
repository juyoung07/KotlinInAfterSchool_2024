// 중첩 for 응용
fun main() {
    for (i in 1..5) {
        for (j in 1..i)
            print("*")
        println()
    }
    println()

    for (i in 1..5) {
        for (j in i..5)
            print("*")
        println()
    }

    for (i in 1..5) {
        for (j in 1..(5-i))
            print(" ")
        for (j in 1..i)
            print("*")
        println()
    }
}