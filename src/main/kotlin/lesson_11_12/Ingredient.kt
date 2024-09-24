package lesson_11_12

//class Ingredient {
//    var name = "some name"
//    var weight = 12
//    var count = 2
//}

//class Ingredient(_name: String, _weight: Int, _count: Int) {
//    var name = _name
//    var weight = _weight
//    var count = _count
//}

class Ingredient(val name: String, val weight: Int, val count: Int) {
var isNeedToPrepare: Boolean = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ): this(name, weight, count) {
        this.isNeedToPrepare = _isNeedToPrepare
    }

    init {
        println("Ingredient $name was created")
    }
}

fun main() {
    //val ingredient1 = Ingredient()
//    val ingredient2 = Ingredient("sugar", 23, 12)
    val ingredient3 = Ingredient("paprika", 34, 12)
    val ingredient4 = Ingredient("onion", 11, 34, true)


    println(ingredient3.name)
    println(ingredient4.name + " " + ingredient4.isNeedToPrepare)
//
//    println(ingredient2.name)

//    println(ingredient1.count)
}