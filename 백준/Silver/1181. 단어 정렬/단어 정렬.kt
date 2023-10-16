fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val list = List(n) { readLine() }
        .distinct()
        .sortedWith(compareBy({ it.length }, { it }))

    list.forEach {
        println(it)
    }

}