import java.time.LocalDate

class Solution {
    
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {

        val answer = mutableListOf<Int>()

        val date = LocalDate.parse(today.replace(".", "-"))

        val termsMap = mutableMapOf<Char, Int>()

        terms.forEach {
            val term = it.split(" ")
            val termType: Char = term[0][0]
            val expiredMonth: Int = term[1].toInt()
            termsMap[termType] = expiredMonth
        }

        privacies.forEachIndexed { index, it ->
            val privacy = it.split(" ")
            val privacyDate = LocalDate.parse(privacy[0].replace(".", "-"))
            val privacyType = privacy[1][0]

            if (!date.isBefore(privacyDate.plusMonths(termsMap[privacyType]!!.toLong()))) {
                answer.add(index + 1)
            }

        }

        return answer.toIntArray()
    }
    
}