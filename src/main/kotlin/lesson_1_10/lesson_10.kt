package lesson_1_10

fun main() {
    printNameAndAge(getName(), getAge())
}

fun getName(): String? = readLine()

fun getAge(): Int? = readLine()?.toInt()


fun printNameAndAge(name: String?, age: Int?) {
    println("Данные пользователя: $name, $age лет")
}