class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val a = mutableListOf<Int>()
        
        for(i in numbers.indices) { 
            for(j in numbers.indices) {
                if(i != j) {
                  a.add(numbers[i]+numbers[j])  
                }
            } 
        }
        a.sort()
        answer = a.distinct().toIntArray()
        return answer
    }
}