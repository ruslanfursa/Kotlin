package lesson_1_10

fun main() {
    val userAge = readLine()!!.toInt()

//    if (userAge >= lesson_1_10.AGE_OF_MAJORITY) {
//        println("Show adult content")
//    } else if (userAge == 16 || userAge == 17) {
//        println("Show edited content")
//    } else {
//        println("Go to bed")
//    }


    var resultText: String = if(userAge >= AGE_OF_MAJORITY)  "Show adult content"
    else if (userAge == 16 || userAge == 17) "Show edited content"
    else "Go to bed"

    println(resultText)

    val consoleNumber = when(userAge) {
        10 -> "number is - 10"
        20 -> "number is - 20"
        30 -> "number is - 30"
        else -> "you print wrong number"
    }
    println(consoleNumber)

}

const val AGE_OF_MAJORITY = 18