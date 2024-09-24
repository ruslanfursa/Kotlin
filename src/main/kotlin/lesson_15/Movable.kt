package lesson_15

interface Movable  {
    fun startEngine() {
        println("engine started")
    }

    fun prepareForTakeOff()
    fun prepareForLanding()
}