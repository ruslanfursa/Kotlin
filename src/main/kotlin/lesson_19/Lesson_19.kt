package lesson_19

fun main() {
    val statusesFromServer = listOf(101, 102, 103, 104)

    for(i in statusesFromServer) {
        when(i) {
            101 -> setStatus(Status.NEW)
            102 -> setStatus(Status.COOKING)
            103 -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
    }
}

enum class Status {
    NEW,
    COOKING,
    COMPLETED,
    ERROR,
}

fun setStatus(status : Status) {
    when(status) {
        Status.NEW -> println("order got")
        Status.COOKING -> println("order is preparing")
        Status.COMPLETED -> println("order is ready")
        Status.ERROR -> println("something went wrong")
    }

}