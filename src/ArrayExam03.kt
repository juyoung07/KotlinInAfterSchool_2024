fun main() {
//    var names = arrayOfNulls<String>(4)
//    names[0] = "Kim"
//    names.set(1, "Kang")
//
//    var n0 = names[0]
//    var n1 = names.get(1)
//    println("$n0, $n1")

    var names = arrayOf<String>("Java", "Python", "HTML", "Kotlin")

    for (i in 0..names.size-1)
        println("names[$i] = ${names[i]}")

    for (i in names)
        println(i)

    for (i in names.indices)                // 인덱스만 나옴
        println(i)

    for ((i, x) in names.withIndex())       // 인덱스와 값
        print("names[$i] = $x \t")
}