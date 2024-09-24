package lesson_1_10

fun main() {

    val greeting: String = "Здравствуйте"

 //   val space = ' '
    val userName = "John Snow"
    // println(greeting + ", " + userName + '!' + space + "Какой будет вопрос?")
    println("$greeting, $userName! Какой будет вопрос?")
    println("На который можно ответить ${2 + 2}")

    val multiString = """
        stroka1
        stroka2
        stroka7
    """.trimIndent()
    println(multiString)
}