class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf(7,7)
        for(i in lottos.indices) {
            if(win_nums.contains(lottos[i])){
                answer[0]--
                answer[1]--
            }
            if(lottos[i]==0) answer[0]--
        }
        for(i in 0..1) if(answer[i]==7) answer[i]--
        
        return answer
    }
}