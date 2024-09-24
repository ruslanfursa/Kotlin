package lesson_15

abstract class SpaceShuttle : Movable, Shootable {
    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("diagnostic started")
    }

    override fun prepareForTakeOff() {
        println("move out wings")
    }

    override fun prepareForLanding() {
        println("move in wings")
    }

    override fun startShoot() {
        println("start shoot")
    }

    override fun reloadGuns() {
        println("reload guns of spaceShuttle")
    }
}