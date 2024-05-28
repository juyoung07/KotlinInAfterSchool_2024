package Chapter05

class Book(var title: String, var author: String) {
    init {
        println("** 생성자 호출됨 ***")
    }

    constructor(title: String) : this(title, "작자미상")
    constructor() : this("제목 없음", "작자미상")

    fun show() = println("$title $author")
}

fun main() {
    var littlePrince = Book("어린왕자", "생텍쥐페리")
    littlePrince.show()

    var loveStory = Book("춘향전")
    loveStory.show()

    var emptyBook = Book()
    emptyBook.show()
}