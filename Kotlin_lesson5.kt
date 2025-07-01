package Lessons

fun main() {
    val userAge = readln().toInt()
    if (userAge >= AGE_OF_MAJORITY) {
        println("Welcome to My website")
    } else {
        val consoleMessage = when (userAge) {
            10 -> "Sizning yoshingiz $userAge"
            else -> "Siz hali voyaga yetmagansiz. Yosh: $userAge"
        }

        println(consoleMessage)
        println("Sorry, you're too young.")
    }

}

const val AGE_OF_MAJORITY1 = 18
