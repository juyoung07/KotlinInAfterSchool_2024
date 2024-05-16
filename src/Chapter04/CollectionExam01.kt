package Chapter04

// 불변형
fun main () {
    var numbers:List<String> = listOf("1", "2", "3", "4", "5")

    for (i in 0..numbers.size - 1)
        print("${numbers.get(i)}")
    println()

    for (i in numbers)
        print("$i")
    println()

    numbers.forEach { print(it) }
}