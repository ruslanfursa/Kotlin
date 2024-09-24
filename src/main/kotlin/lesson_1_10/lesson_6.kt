package lesson_1_10

fun main() {
    var counter = readLine()!!.toInt()

    while(counter > 0) {
        println("Реклама закончиться через ${counter--} минут")
    }
}