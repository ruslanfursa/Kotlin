package lesson_11_12

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {
    fun addTuFavorites() {
        println("Dish $name was added to favorites")
        inFavorites = true
    }
    fun removeFromFavorites() {
        println("Dish $name was removed from favorites")
        inFavorites = false
    }

    fun startCooking() {
        println("User started cooking: $name")
    }

    fun downloadIngredients(): List<String>  {
        return ingredients
    }


}