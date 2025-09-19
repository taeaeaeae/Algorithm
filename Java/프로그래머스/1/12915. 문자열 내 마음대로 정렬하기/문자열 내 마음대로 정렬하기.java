import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String temp = "";
        for(int i = 0; i < strings.length-1; i++) {
            for(int j= 1 ; j < strings.length-i; j++) {
                if(strings[j-1].charAt(n) > strings[j].charAt(n)) {
                    temp = strings[j-1];
                    strings[j-1] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        
        return strings;
    }
}