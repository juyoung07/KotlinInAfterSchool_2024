fun findFirstName(vararg Names: String) {
    for (name in Names) {
        if (name.length == 3) {
            println("Found $name")
            return
        }
    }
}

fun main() {
    var s = arrayOf<String>("abcdefg", "aaa", "dd")
    findFirstName(*s)
}