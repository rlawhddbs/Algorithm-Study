fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

        val files = mutableListOf<String>()
        val n = readLine().toInt()

        if (n == 1) {
            println(readLine())
            return
        } else {
            repeat(n) {
                files.add(readLine())
            }
        }

        val check = BooleanArray(files[0].length) {
            true
        }

        for (i in files[0].indices) {
            for (j in 1 until n) {
                if (check[i]) check[i] = files[0][i] == files[j][i]
            }
        }

        println(
            check.mapIndexed { i: Int, b: Boolean ->
                if (b) files[0][i]
                else '?'
            }.joinToString("")
        )

    }