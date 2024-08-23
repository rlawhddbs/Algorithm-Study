import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val input: String = nextLine()

    for (alphabet in 'a' .. 'z') {
        print("${input.indexOf((alphabet))} ")
    }

}