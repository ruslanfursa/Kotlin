package lesson_16

fun main() {

    val guide = HitchHikersGuide()

    println(guide.getNumberOfPages())

    guide.setNumberOfPages(1111)

    println(guide.getNumberOfPages())
}