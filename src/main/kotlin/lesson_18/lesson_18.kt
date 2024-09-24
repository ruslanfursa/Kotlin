package lesson_18

import java.util.*

fun main() {
val creationDate = Date()
    val note = NotesAppItem()

    note.addItemToCell(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )
    println()

    note.addItemToCell(
        "call sister",
        creationDate,
        "message",
        1234323
    )
    println()

    note.addItemToCell(
        "call sister",
        creationDate,
        "message",
        listOf("call sister to congratulate", "wash dog")
    )
}