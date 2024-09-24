package lesson_14

open class SpaceShip(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
        println("ship $name is in wrap mode")
    }

    open fun runSystemDiagnostic() {
        println("diagnostic of $name was started")
    }
}