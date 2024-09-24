package lesson_14

fun main() {

    val ship1 = SpaceShip("ship1", 2324)

    println("This is - ${ship1.name} ${ship1.speed}")

    ship1.switchToWarpMode()
    ship1.runSystemDiagnostic()

    val scoutShip1 = ScoutShip("scout1", 232, 12222)
    scoutShip1.runSystemDiagnostic()
    scoutShip1.switchToWarpMode()
    println(scoutShip1.unmanned)
    scoutShip1.runAfterBurned()
    println()

    val industrialShip1 = IndustrialShip("industrial", 121, 3)
    industrialShip1.switchToWarpMode()
    industrialShip1.runSystemDiagnostic()
    industrialShip1.launchScanningDrones()
    println(industrialShip1.unmanned)

}