fun main() {
    // write your code here
    val x = 2

    val result = when (x) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "right"
        0 -> "do not move"
        else -> "error"
    }
    println(result)
}
