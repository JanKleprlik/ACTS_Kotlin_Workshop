package fibonacci

tailrec fun fibonacci_tailrec(n: Int, a: Int = 0, b: Int = 1): Int {
    if (n == 0) {
        return a
    }
    if (n == 1) {
        return b
    }
    return fibonacci_tailrec(n - 1, b, a + b)
}