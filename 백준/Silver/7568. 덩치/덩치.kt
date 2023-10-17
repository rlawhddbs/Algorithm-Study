fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val list = List(n) { readLine() }

    list.forEachIndexed { index, s ->

        var count = 1

        val (x, y) = s.split(" ").map { it.toInt() }

        for (i in 0 until n) {

            if (i == index) {
                continue
            }

            val (p, q) = list[i].split(" ").map { it.toInt() }

            if (x < p && y < q) {
                count++
            }

        }

        println(count)

    }

}
