class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = 0;
        int xCnt = 0;
        int yCnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(xCnt == 0) {
                x = s.charAt(i);
            }
            if(s.charAt(i) == x) {
                xCnt++;
            } else {
                yCnt++;
            }
            if(xCnt == yCnt) {
                answer++;
                xCnt = 0;
                yCnt = 0;
            }
        }
        if(xCnt != 0) {
            answer++;
        }
        return answer;
    }
}