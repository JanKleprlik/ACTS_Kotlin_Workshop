package fibonacci

import kotlin.time.measureTime

fun main() {
    val small = 20
    println("Fibonacci: $small")
    println( measureTime {
        println(fibonacci_recursive(small))
    })
    println( measureTime {
        println(fibonacci_iterative(small))
    })
    println( measureTime {
        println(fibonacci_tailrec(small))
    })

    val large = 45
    println("Fibonacci: $large")
    println( measureTime {
        println(fibonacci_recursive(large))
    })
    println( measureTime {
        println(fibonacci_iterative(large))
    })
    println( measureTime {
        println(fibonacci_tailrec(large))
    })
}