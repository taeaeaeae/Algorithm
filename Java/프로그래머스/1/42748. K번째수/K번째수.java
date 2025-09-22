import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int j=0; j < commands.length; j++) {
            int[] temp = new int[commands[j][1]-commands[j][0]+1];
            for(int i = commands[j][0];i <= commands[j][1]; i++ ) {
                temp[i-commands[j][0]] = array[i-1];
            }
            Arrays.sort(temp);
            answer[j] = temp[commands[j][2]-1];
        }
        
        return answer;
    }
}