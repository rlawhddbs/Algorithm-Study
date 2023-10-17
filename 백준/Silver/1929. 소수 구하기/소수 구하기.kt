import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {

    val (n, m) = readln().split(" ").map { it.toInt() }

    val list = BooleanArray(1_000_000) { true }

    for (i in n..m) {
        for (j in 2..sqrt(i.toDouble()).toInt())
            if (i % j == 0) {
                list[i] = false
                break
            }
    }

    for (i in n..m) {
        if (list[i] && i != 1) {
            println(i)
        }
    }
}