package lesson_14

class IndustrialShip(
    name: String,
    speed: Int,
    numberOfMiners: Int,
) : SpaceShip(name, speed, unmanned = true) {
    fun launchScanningDrones() {
        println("$name drones was launched")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("diagnostic of Miners was started")
    }
}

