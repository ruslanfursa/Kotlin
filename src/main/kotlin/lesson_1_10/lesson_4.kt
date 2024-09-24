package lesson_1_10

fun main() {
    val userAge: Int = 32
    var comparisonResult: Boolean
 //   comparisonResult = userAge >= lesson_1_10.AGE_OF_MAJORITY && userAge <= lesson_1_10.RETIREMENT_AGE
    comparisonResult = userAge in AGE_OF_MAJORITY .. RETIREMENT_AGE

    println("Результат проверки возраста пользователя $comparisonResult")
}

//const val lesson_1_10.AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65