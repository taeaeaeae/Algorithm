import java.util.*

class Solution {
    fun solution(answers: IntArray): IntArray {
        var temp = intArrayOf(0,0,0)
        var temp1 = intArrayOf(1,2,3,4,5)
        var temp2 = intArrayOf(2,1,2,3,2,4,2,5)
        var temp3 = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        
        for(i in answers.indices) {
            if(answers[i]==temp1[i%5]) temp[0]++
            if(answers[i]==temp2[i%8]) temp[1]++
            if(answers[i]==temp3[i%10]) temp[2]++
        }
        val max = temp.maxOrNull()

        var res : MutableList<Int> = mutableListOf(1)
        for(i in temp.indices) {
            if (temp[i] >= max!!) res.add(i+1) 
        }
        res.removeAt(0)
        var answer = IntArray(res.size)
        for(i in answer.indices) {
            answer[i] = res[i]
        }
        
        
        return answer
    }
}