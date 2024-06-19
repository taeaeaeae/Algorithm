class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(s.length) {-1}
        for(i in 1 .. s.length-1){
            var t = 1
            while(t<=i){
                if(s[i-t]==s[i]) { 
                    answer[i] = t
                    t = i+1
                }
                t++
            }
        }
        
        return answer
    }
}