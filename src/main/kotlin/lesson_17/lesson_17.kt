package lesson_17

fun main() {
val fish = BabelFish(null)
//    println("old value: ${fish.nerveSignalLevel}")
//    println("old value: ${fish.isTranslated}")
//
//    fish.nerveSignalLevel = 301
//
//    println("new value: ${fish.nerveSignalLevel}")
//    println("new value: ${fish.isTranslated}")

    val fish1 = BabelFish(123)
    println(fish1.nerveSignalLevel)
    val fish2 = BabelFish(323)
    println(fish2.nerveSignalLevel)

}