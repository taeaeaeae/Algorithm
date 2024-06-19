class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        var arr = s.toCharArray()
        for (i in arr.indices) {
            arr[i] = when {
                arr[i] in 'a'..'z' -> ((arr[i] - 'a' + n) % 26 + 'a'.toInt()).toChar()
                arr[i] in 'A'..'Z' -> ((arr[i] - 'A' + n) % 26 + 'A'.toInt()).toChar()
                else -> arr[i]
            }
        }
        answer = arr.joinToString("")
        return answer
    }
}