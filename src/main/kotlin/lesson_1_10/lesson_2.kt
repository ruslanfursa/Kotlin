package lesson_1_10

fun main() {
    var a: Int = 5
    var b: Int = 7
    var sum: Int = a + b

    println(sum)

    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2)

    val floatNum1 = 10f
    val floatNum2 = 3f
    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0

    println(doubleNum1 / doubleNum2)
    println(10 % 3)

    val c = intNum1 + floatNum1
    println(c :: class.simpleName)

    val d = intNum1 + floatNum1 + doubleNum1
    println(d :: class.simpleName)





}