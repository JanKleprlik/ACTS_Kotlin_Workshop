package fibonacci

fun fibonacci_recursive(n: Int): Int {
    if (n <= 1) {
        return n
    }
    return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)
}
