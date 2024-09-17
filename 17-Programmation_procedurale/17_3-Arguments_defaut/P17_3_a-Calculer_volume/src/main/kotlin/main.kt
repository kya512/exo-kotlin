fun getVolume(lengh: Int, width: Int = 4, height: Int = 5): Int{
    val volume = lengh*width*height
    return volume
}

fun main() {
    println(getVolume(1))
}