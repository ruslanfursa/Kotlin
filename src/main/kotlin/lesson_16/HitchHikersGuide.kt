package lesson_16

class HitchHikersGuide {
    var title = ""

    private var numberOfPages = 9999

    fun chooseArticle() {
        println("Open catalog")
    }

    fun getNumberOfPages() {
        println(numberOfPages)
    }

    fun setNumberOfPages(number: Int) {
        numberOfPages = number
    }
}

class Support {
    fun printInfo() {
        println(HitchHikersGuide::class.simpleName)
        println(HitchHikersGuide().title)
    }
}