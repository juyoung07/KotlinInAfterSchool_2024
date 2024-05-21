package Chapter04

fun main() {
    val langMutableMap:MutableMap<Int, String> = mutableMapOf(1 to "java", 2 to "kotlin", 3 to "C")

    langMutableMap.put(4, "JSP")
    langMutableMap.remove(1)

    for((key, value) in langMutableMap) {
        println("key = $key, value = $value")
    }
    println("첫번째 키: ${langMutableMap.keys.first()}")
    println("마지막 값: ${langMutableMap.getValue(langMutableMap.keys.last())}")
}