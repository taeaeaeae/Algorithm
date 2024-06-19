class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val w = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val mon = when(a) {
            4 -> a*61+5 
            7,10,2 -> a*61 +4
            1 ,12 -> a*61 + 6
            3, 6, 9 ->  a*61
            else -> a*61+2
        }
        return w[(mon+b)%7]
    }
}