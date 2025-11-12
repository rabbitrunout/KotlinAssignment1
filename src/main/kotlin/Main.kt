package org.example

// Kotlin Assignment 1

// Description: Solving four Kotlin programming challenges (A–D) demonstrating summation,
// iterative, lambda, and recursive factorial functions.

/* ==========================================================
   🅐  SUM FUNCTION
   ----------------------------------------------------------
   Create a function that adds (sums) integers starting at 1
   up to a specified maximum.
   ========================================================== */
fun sumUpTo(max: Int): Int {
    var sum = 0
    for (i in 1..max) sum += i
    return sum
}

/* ==========================================================
   🅑  ITERATIVE FACTORIAL
   ----------------------------------------------------------
   Create an iterative function that finds the factorial of
   a specified integer.
   ========================================================== */
fun factorialIterative(n: Int): Long {
    var result = 1L
    for (i in 1..n) result *= i
    return result
}

/* ==========================================================
   🅒  LAMBDA FACTORIAL
   ----------------------------------------------------------
   Rewrite the iterative factorial function as a lambda expression.
   ========================================================== */

val factorialLambda: (Int) -> Long = { n ->
    var result = 1L
    for (i in 1..n) result *= i
    result
}

/* ==========================================================
   🅓  RECURSIVE FACTORIAL
   ----------------------------------------------------------
   Convert the iterative factorial function into a recursive one.
   ========================================================== */
fun factorialRecursive(n: Int): Long {
    return if (n <= 1) 1L else n * factorialRecursive(n - 1)
}

/* ==========================================================
   🧠  MAIN FUNCTION – TESTING ALL SOLUTIONS
   ========================================================== */

fun main() {
    println("=== Kotlin Assignment 1 ===\n")

    // A. Test sum function
    println("A. Sum from 1 to 10 = ${sumUpTo(10)}\n")

    val number = 5

    // B. Iterative factorial
    println("B. Factorial (iterative) of $number = ${factorialIterative(number)}")

    // C. Lambda factorial
    println("C. Factorial (lambda) of $number = ${factorialLambda(number)}")

    // D. Recursive factorial
    println("D. Factorial (recursive) of $number = ${factorialRecursive(number)}")

    println("\n=== End of Program ===")
}
