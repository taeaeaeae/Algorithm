class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ('A' <= c && c <= 'Z') {
                c = (char)((c - 'A' + n) % 26 + 'A');
            } else if ('a' <= c && c <= 'z') {
                c = (char)((c - 'a' + n) % 26 + 'a');
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
