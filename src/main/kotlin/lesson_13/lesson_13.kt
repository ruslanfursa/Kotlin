package lesson_13

fun main() {
    val nullableString: String? = null
    val notNullableString = "hello"

    println(nullableString?.length)
    println(notNullableString.length)

   // val nullableString2: String? = readLine()

    val nullableStringLength: Int = nullableString?.length ?: 12

    println(nullableStringLength)
}