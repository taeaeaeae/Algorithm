class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val m = mutableListOf("aya", "ye", "woo", "ma")
        var d = babbling.toMutableList()
        for(i in babbling.indices) {
            for(j in m.indices){
                if (!d[i].contains("${m[j]}${m[j]}")){
                    d[i] = d[i].replace(m[j]," ")   
                }
            }
            
            if(d[i].replace(" ","").length==0) answer++
            
        }
        return answer
    }
}