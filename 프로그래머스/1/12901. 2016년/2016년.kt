class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val w = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        var mon = (a-1)*30
        
        if(a >= 11 ) mon +=2
        else if(a==4||a==5||a==2) mon +=5
        else if(a == 7 || a==6 ) mon +=6
        else if(a == 8) 
        else if(a == 1 || a==3) mon +=4
        else mon +=1
        return w[(mon+b)%7]
    }
}