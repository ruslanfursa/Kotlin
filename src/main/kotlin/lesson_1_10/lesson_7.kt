package lesson_1_10

fun main() {

    val range1: IntRange = 42 .. 442
    val range2: IntRange = 42 until 442
    val range3: LongRange = 42L .. 442L
    val range4: CharRange = 'a' .. 'z'
    val range5: ClosedRange<Double> = 42.1 .. 442.2
    val range6: ClosedRange<Float> = 42.1f .. 442.2f
    val range7: IntProgression = 42 .. 442 step 2
    val range8: IntProgression = 442 downTo 42 step 2

    val a: Boolean = 52 in range1
    val b: Boolean = 520 in range1


    println(a)
    println(b)

    for(i in 5 downTo 1) {
        if(i == 3) {
//            println("user pressed \"exit\"")
//            break
            println("3 will not be printed")
            continue
        }
        println("game over in $i seconds")
      //  Thread.sleep(1000)
    }

    println("Code after break")

//    for(i in range2 step 8) {
//        println(i)
//    }
}