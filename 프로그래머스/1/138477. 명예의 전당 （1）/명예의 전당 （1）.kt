class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = IntArray(score.size,{0})
        val t = mutableListOf<Int>()
        answer[0] = score[0]
        t.add(score[0])
        for(i in 1..score.size-1){
            t.add(score[i])
            if(t.size>k) t.remove(t.minOrNull())
            answer[i] = t.minOrNull() ?: 0
        }
        
        return answer
    }
}