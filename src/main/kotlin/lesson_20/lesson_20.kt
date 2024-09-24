package lesson_20

import java.util.Calendar

fun main() {
    val calendar: Calendar = Calendar.getInstance()
    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear.invoke())

}