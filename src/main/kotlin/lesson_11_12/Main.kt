package lesson_11_12

fun main() {
    val dish1: Dish = Dish(
        id = 1,
        name = "eggs",
        category = "breakfast",
        ingredients = listOf("egg", "tomatoes"),
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "soup",
        category = "dinner",
        ingredients = listOf("egg", "tomatoes", "water", "sugar"),
    )

    println(dish1.category)
    println(dish2.ingredients.get(3))

    dish1.category = "supper"

    println(dish1.category)

    println("First dish cooking")
    dish1.addTuFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()
    println("------------")

    println("cooking soup started ")
    dish2.addTuFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)

}