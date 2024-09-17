fun isGreater(a: Int,b: Int,c:Int,d:Int ): Boolean {
    val sum_ab = a + b
    if ( sum_ab > c || sum_ab > d) {
        return true
    }
    else{
        return false
    }
}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}
