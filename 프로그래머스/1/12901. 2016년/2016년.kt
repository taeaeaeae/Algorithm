class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val w = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        var mon = (a)*61
        
        if(a == 4 ) mon +=5
        else if(a==7|| a ==10 || a==2) mon +=4
        else if(a == 1  || a == 12) mon +=6
        else if(a%3==0) mon
        else mon +=2
        return w[(mon+b)%7]
    }
}