class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {

        var answer: Int = 0

        val giftBreakdown = friends.map { friend ->
            MutableList(friends.size) { i ->
                if (friends[i] == friend) null
                else gifts.count { it == "$friend ${friends[i]}" }
            }.toMutableList()
        }

        val presentIndex: Array<Int> = Array(friends.size, { index ->
            gifts.count { it.split(" ")[0] == friends[index] } -
            gifts.count { it.split(" ")[1] == friends[index] }
        })

        //[[0, 2, 0], [3, 0, 0], [1, 1, 0], [1, 0, 0]]
        //-3 2 0 1

        friends.forEachIndexed() { index, friend ->
            var temp = 0
            for (i in 0 until friends.size) {
                if (giftBreakdown[index][i] == null) continue // 자기 자신

                val presentCount = giftBreakdown[index][i]!! - giftBreakdown[i][index]!!

                if (presentCount > 0) { // 더 많은 선물을 준 사람
                    temp++
                } else if (presentCount == 0 && presentIndex[index] > presentIndex[i]) { // 선물 지수가 더 큰 사람
                    temp++
                }
            }
            if (temp > answer) {
                answer = temp
            }
        }

        return answer
    }
}