fun main() = with(System.`in`.bufferedReader()) {

    val bw = System.out.bufferedWriter()

    readLine().toInt()

    val listA = readLine().split(" ").map { it.toInt() }.sortedWith(compareBy { it })

    readLine().toInt()

    val listM = readLine().split(" ").map { it.toInt() }

    listM.forEach {
        if (listA.binarySearch(it) < 0) {
            bw.write("0")
            bw.newLine()
        } else {
            bw.write("1")
            bw.newLine()
        }
    }

    bw.flush()

}