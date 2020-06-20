package bot

import java.util.*


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Kot", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
}

fun remindName() {
    println("Please, remind me your name.")
    println("What a great name you have, ${readLine()!!}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val (mod3, mod5, mod7) = List(3) { scanner.nextInt() }
    val age = (mod3 * 70 + mod5 * 21 + mod7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    for (i in 0..scanner.nextInt()) println("$i!")
}

fun test() {
    println("Let's test your programming knowledge.")
    println("""Why do we use methods?
        |1. To repeat a statement multiple times.
        |2. To decompose a program into several small subroutines.
        |3. To determine the execution time of a program.
        |4. To interrupt the execution of a program.""".trimMargin())
    while (scanner.nextInt() != 2) println("Please, try again.")
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
