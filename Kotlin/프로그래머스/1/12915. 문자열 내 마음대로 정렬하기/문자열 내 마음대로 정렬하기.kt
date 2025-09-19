class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = Array(strings.size) { i -> strings[i][n].toString() }
        answer.sort()
        var t = strings.toMutableList()
            t.sort()
        for(j in answer.indices){
            var i = 0
            while(t.size>i) {
                if(answer[j]==t[i][n].toString()) {
                    answer[j] = t[i]
                    t.removeAt(i)
                } else {
                    i++
                }
            }
        }
        
        return answer
    }
}