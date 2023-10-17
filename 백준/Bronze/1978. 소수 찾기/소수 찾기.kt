fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val list = readLine().split(" ").map { it.toInt() }

    var result = 0

    list.forEach {
        if (isPrime(it)) {
            result++
        }
    }

    println(result)

}

fun isPrime(i: Int): Boolean {

    if (i == 1) return false

    for (j in 2 until i) {
        if (i % j == 0) {
            return false
        }
    }

    return true
}