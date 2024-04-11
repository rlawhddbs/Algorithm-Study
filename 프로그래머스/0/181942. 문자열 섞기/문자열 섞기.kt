class Solution {
    fun solution(str1: String, str2: String) = str1.zip(str2).joinToString(separator = "") { "${it.first}${it.second}" }
}