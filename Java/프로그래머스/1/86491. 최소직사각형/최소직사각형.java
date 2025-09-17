class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0]>sizes[i][1]) {
                w = (sizes[i][0]>w) ? sizes[i][0] : w;
                h = (sizes[i][1]>h) ? sizes[i][1] : h;
            } else {
                w = (sizes[i][1]>w) ? sizes[i][1] : w;
                h = (sizes[i][0]>h) ? sizes[i][0] : h;
            }
        }
        answer = w*h;
        return answer;
    }
}