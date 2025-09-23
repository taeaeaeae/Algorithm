import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length*(numbers.length-1)];
        int temp = 0;
        for(int i=0; i<numbers.length; i++) {
            for(int j = 0; j<numbers.length; j++) {
                if(i == j) continue;
                answer[temp] = numbers[i]+numbers[j];
                temp++;
            }
        }
        Arrays.sort(answer);
        return Arrays.stream(answer).distinct().toArray();
    }
}