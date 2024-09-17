fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Double {
    return Math.hypot(x1 , y1)
}

fun main() {
    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}