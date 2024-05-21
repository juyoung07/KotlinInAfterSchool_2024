fun main() {
    var langMap:Map<Int, String> = mapOf(1 to "java", 2 to "kotlin", 3 to "c")
    for((key, value) in langMap)
        println("key = $key, value = $value")

    println()
    println("langMap[1] = ${langMap[0]}")
    println("langMap[2] = ${langMap.get(2)}")
    println("langMap.keys = ${langMap.keys}")
    println("langMap.values = ${langMap.values}")
}