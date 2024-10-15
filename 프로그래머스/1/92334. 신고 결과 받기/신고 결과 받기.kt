class Solution {
    var userList = listOf<User>()

    class User(
        val id: String,
        var reported: Int = 0,
        val reportList: MutableSet<String> = mutableSetOf(),
    )

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

        userList = id_list.map { User(it) }

        report.forEach { str ->
            val (reporter, reported) = str.split(" ")
            val reporterUser = findById(reporter)
            val reportedUser = findById(reported)

            if (reporterUser.reportList.add(reported)) {
                reportedUser.reported++
            }
        }

        return userList.map { user ->
            user.reportList.count { findById(it).reported >= k }
        }.toIntArray()
    }

    fun findById(id: String): User {
        return userList.first { it.id == id }
    }
}