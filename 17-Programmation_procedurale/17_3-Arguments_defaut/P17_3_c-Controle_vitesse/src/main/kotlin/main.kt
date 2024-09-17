fun checkSpeed(speed: Int, limit: Int = 60): String {
    val n = speed - limit
    return if(speed > limit) "Exceeds the limit by $n kilometers per hour" else "Within the limit"
}

fun main() {
    println(checkSpeed(100, 60))
    println(checkSpeed(40, 90))
    println(checkSpeed(61))
    print(checkSpeed(60))
}