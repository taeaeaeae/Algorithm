class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1
        var i = 0
        var now = section[0]
        for(i in section.indices){
            if(section[i] > now + m -1) { 
                now = section[i]
                answer++
            }
        }
        return answer
    }
}