fun isVowel(char: Char) : Boolean {
    return (char in listOf<Char>('a', 'e', 'i', 'o', 'u'))
}

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}
