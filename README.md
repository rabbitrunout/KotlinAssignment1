# triOS College  

## Mobile & Web Development Program  


## ✨ Project Overview
This report presents **Kotlin Assignment 1**, which demonstrates Kotlin control flow, function creation, iteration, lambda expressions, and recursion.  
The project was developed using **IntelliJ IDEA** and managed via **GitHub**.

---

# 🧮 KotlinAssignment1

This repository contains four Kotlin programming exercises (A–D) demonstrating iteration, lambda expressions, and recursion.

---

## 📘 Objectives

The purpose of this assignment was to:
1. Practice Kotlin syntax and control-flow constructs  
2. Implement arithmetic algorithms using functions  
3. Explore iterative, lambda, and recursive approaches  
4. Use Git and GitHub to manage the project  

---

## 🧩 Tasks & Solutions

### 🅐–🅓 Kotlin Functions (All Solutions in One Code Block)

kotlin
// --- A. Sum of Integers Function ---
fun sumUpTo(max: Int): Int {
    var sum = 0
    for (i in 1..max) sum += i
    return sum
}

// --- B. Iterative Factorial Function ---
fun factorialIterative(n: Int): Long {
    var result = 1L
    for (i in 1..n) result *= i
    return result
}

// --- C. Lambda Factorial Function ---
val factorialLambda: (Int) -> Long = { n ->
    var result = 1L
    for (i in 1..n) result *= i
    result
}

// --- D. Recursive Factorial Function ---
fun factorialRecursive(n: Int): Long {
    return if (n <= 1) 1L else n * factorialRecursive(n - 1)
}

// --- Main Function to Test All ---
fun main() {
    println("=== Kotlin Assignment 1 ===")
    println("A. Sum from 1 to 10 = ${sumUpTo(10)}")
    val number = 5
    println("B. Factorial (iterative) of $number = ${factorialIterative(number)}")
    println("C. Factorial (lambda) of $number = ${factorialLambda(number)}")
    println("D. Factorial (recursive) of $number = ${factorialRecursive(number)}")
    println("=== End of Program ===")
}


Kotlin Assignment 1   
**Campus:** Toronto, ON  

---
