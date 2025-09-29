class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int coke = n;
        while(coke >= a) {
            answer += coke/a*b;
            coke = coke/a*b +coke%a;
        }
        return answer;
    }
}