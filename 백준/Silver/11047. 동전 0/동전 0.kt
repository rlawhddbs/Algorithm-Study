fun main() = with(System.`in`.bufferedReader()) {

    var (n, k) = readLine().split(" ").map { it.toInt() }

    var count = 0

    val list = List(n) {
        readLine().toInt()
    }

    list.reversed().forEach {
        while (true) {
            if (k >= it) {
                k -= it
                count++
            } else {
                break
            }
        }
    }

    println(count)

}