class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val s = listOf(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59)
 
        for(i in 0..nums.size-3) {
            for(j in i+1..nums.size-2){
                for(z in j+1..nums.size-1) {
                    val sum = (nums[i]+nums[j]+nums[z])
                    
                    if(s.contains(sum)) {
                        answer++
                        continue
                    }
                    for(p in s.indices) {
                        if(sum%s[p]==0) break
                        else if(s[p] == 59) answer++
                    } 
                    
                }
            }
        }
        return answer
    }
}