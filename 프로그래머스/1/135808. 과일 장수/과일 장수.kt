class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        
        for(i in 1..((score.size)/m)) {
            answer += m*score[i*m-1]
        }
        
        return answer
    }
}