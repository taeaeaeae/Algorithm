class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        var xx = IntArray(X.length) { X[it].toString().toInt() }.sortedDescending()
        var yy = IntArray(Y.length) { Y[it].toString().toInt() }.sortedDescending()
        var b=if(X.length>=Y.length)xx else yy
        var s=if(X.length<Y.length)xx else yy
        var m : MutableList<Int> = mutableListOf()
        
        IntArray(X.length) { X[it].toString().toInt() }
        var i=0
        var j=0
        while(i<s.size && j<b.size) {
            if(s[i]==b[j]) {
                m.add(s[i])
                i++
                j++
            } else if(s[i].toInt()>b[j].toInt()) i++
             else if(s[i].toInt()<b[j].toInt()) j++
        }
        answer = m.joinToString(separator = "")
        if(answer.isEmpty()) answer="-1" else if(answer[0]=='0') answer="0"
        
        return answer
    }
}