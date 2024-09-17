fun sum(n1: Int, n2: Int, n3: Int): Int{
    return n1+n2+n3
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c ))
}

