package lesson_1_10

fun main() {
    val list: List<Int> = listOf(2, 3, 5)
    val list2: MutableList<Int> = mutableListOf(34, 11,456, 3, 4, 55, 77)

    for(i in list2) {
        println(i)
    }
    list2.add(900)

//    for(i in list2) {
//        println(i)
//    }

    println("---------------")
    println(list2)

    println(list2.contains(828))
    println(list2.isEmpty())
    list2.sort()
    println(list2)

    list2.sortDescending()

    println(list2)

    list2.forEach() {
        println(it + 2)

    }
    println("------")

    val list3 = list2.filter{
        it == 11
    }

    list3.forEach() {
        println(it)
    }

    val list4 = list3.map{
        it * 3
    }

    println(list4)
}