import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val number = nextLine().toInt()

    val inputList = mutableListOf<String>()

    repeat(number) {
        inputList.add(nextLine())
    }

    val scoreList = MutableList(inputList.size) { 0 }

    inputList.forEachIndexed { index, input ->
        var streak = 0
        input.forEach { c ->
            if (c == 'O') {
                streak++
                scoreList[index] += streak
            } else {
                streak = 0
            }
        }
    }

    scoreList.forEach {
        println(it)
    }

}