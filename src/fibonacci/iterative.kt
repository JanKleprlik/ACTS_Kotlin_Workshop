package fibonacci

fun fibonacci_iterative(n: Int): Int {
    var a = 0
    var b = 1
    var c = 0
    for (i in 2..n) {
        c = a + b
        a = b
        b = c
    }
    return b
}