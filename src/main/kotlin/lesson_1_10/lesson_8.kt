package lesson_1_10

fun main() {
    val ingridient1 = "яйцо"
    val ingridient2 = "помидор"
    val ingridient3 = "зелень"
    val ingridient4 = "соль"
    val ingridient5 = "перец"

    val arrayOfIngrideints: Array<String> = arrayOf(ingridient1, ingridient2, ingridient3, ingridient4, ingridient5)

   // println(arrayOfIngrideints.get(4))

    arrayOfIngrideints.set(1, "apple")

    for(i in arrayOfIngrideints) {
        println("Ingridient ${arrayOfIngrideints.indexOf(i) + 1 } : $i")
    }
}