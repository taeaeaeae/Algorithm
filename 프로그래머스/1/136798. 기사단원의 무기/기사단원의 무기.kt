class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(i in 1..number) {
            var d=0
            var k=1
            while(k*k<=i) {
                if (k * k == i) d++
                else if (i % k == 0) d += 2
                if(d>limit) {
                    answer += power
                    break
                }
                k++
            }
            if(d<=limit) answer+=d
        }
        return answer
    }
}