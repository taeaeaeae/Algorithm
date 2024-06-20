class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var i = 0
        var j = 1
        while(j<section.size) {
            if(section[i]+m-1>section[j]) {
                answer++
            } else i++
            j++
            
            println("${answer}???? ${i}!!!!${j}")
        }
        
        return answer
    }
}