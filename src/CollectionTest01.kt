// 서점에 책 넣기
fun main () {
    println("*** 유원 서점 ***")
    var mutableBookList: MutableList<String> = mutableListOf()
    var bookNmae: String

    while (true) {
        print("1. 도서 삽입  2. 도서 리스트 출력  3. 종료 >> ")
        var menu = readln()
        when (menu) {
            "1" -> {
                print("삽입할 도서의 이름 >> ")
                bookNmae = readln()
            mutableBookList.add(bookNmae)
            }
            "2" -> {
                mutableBookList.forEach { println(it) }
            }
            "3" -> break
        }
    }
}