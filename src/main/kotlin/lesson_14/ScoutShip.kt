package lesson_14

class ScoutShip(
    name: String,
    speed: Int,
    val afterBurnedSpeed: Int,
) : SpaceShip(name, speed, unmanned = true) {
    fun runAfterBurned() {
        println("$name afterBurned launched")
    }
}