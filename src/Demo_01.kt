@file:Suppress("DuplicatedCode")

/**
Each line originally contained a specific calibration value that needs to be recovered. On each line, the calibration
value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number.

For example:

1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet

In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.

Consider your entire calibration document. What is the sum of all of the calibration values?

https://adventofcode.com/2023/day/1
 */
fun demo_01(input: String): Int {
    val lines: List<String> = input.split("\n")
    var lineCounter: Int = 0
    var sum: Int = 0

    while (lineCounter < lines.size) {
        val line = lines[lineCounter]
        var first: Char = ' '
        var last: Char = ' '
        var charIdx = 0
        while (charIdx < line.length) {
            if (line[charIdx] > '0' && line[charIdx] < '9') {
                if (first == ' ') {
                    first = line[charIdx]
                }
                last = line[charIdx]
            }
            charIdx++
        }

        if (first != ' ') {
            val number: Int = (first.toString() + last.toString()).toInt()
            sum += number
        }
        lineCounter++
    }

    return sum
}