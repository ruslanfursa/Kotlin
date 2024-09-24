package lesson_21

import java.io.File

fun main() {
    val file = File("test.txt")
    file.writeMessageToFile()
}

fun File.writeMessageToFile() {
    val message = "some message to file"
    createNewFile()
    writeText(message)
    println("message \"$message\" added to file $name and sent")

}