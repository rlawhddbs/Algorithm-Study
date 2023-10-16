fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

        val input = mutableListOf<String>()

        repeat(5) {
            input.add(readLine())
        }

        var result = ""

        for (i in input.indices) {
            if (input[i].contains("FBI")) {
                result = result.plus("${i+1} ")
            }
        }

        println(
            if (result == "") "HE GOT AWAY!"
            else result.trim()
        )

    }