import java.util.Scanner

// Function for Addition
fun add(a: Double, b: Double): Double {
    return a + b
}

// Function for Subtraction
fun subtract(a: Double, b: Double): Double {
    return a - b
}

// Function for Multiplication
fun multiply(a: Double, b: Double): Double {
    return a * b
}

// Function for Division
fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Error! Division by zero.")
        return 0.0
    }
    return a / b
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter first number: ")
    val num1 = scanner.nextDouble()

    println("Enter second number: ")
    val num2 = scanner.nextDouble()

    println("Choose operation: +, -, *, /")
    val operator = scanner.next()[0]

    val result = when (operator) {
        '+' -> add(num1, num2)
        '-' -> subtract(num1, num2)
        '*' -> multiply(num1, num2)
        '/' -> divide(num1, num2)
        else -> {
            println("Invalid operator")
            return
        }
    }

    println("Result: $result")
}
