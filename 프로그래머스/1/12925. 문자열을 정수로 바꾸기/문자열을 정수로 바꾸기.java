class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '-') {
            answer = Integer.parseInt(s.substring(1));
            answer = answer - (answer * 2);
        } else if (s.charAt(0) == '+'){
            answer = Integer.parseInt(s.substring(1));
        } else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}