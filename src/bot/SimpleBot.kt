package bot

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Kot.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    println("What a great name you have, ${readLine()!!}!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val mod3 = scanner.nextInt()
    val mod5 = scanner.nextInt()
    val mod7 = scanner.nextInt()

    println("Your age is ${(mod3 * 70 + mod5 * 21 + mod7 * 15) % 105}; that's a good time to start programming!")
}