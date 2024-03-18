class Solution {
    fun solution(babbling: Array<String>): Int {

        var answer: Int = 0

        babbling.forEach {
            if (
                it.replaceFirst("aya", " ")
                    .replaceFirst("ye", " ")
                    .replaceFirst("woo", " ")
                    .replaceFirst("ma", " ")
                    .isBlank()
            ) {
                answer++
            }
        }

        return answer
    }
}