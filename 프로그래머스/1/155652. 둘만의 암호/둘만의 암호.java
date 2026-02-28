class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(char c = 'a'; c <= 'z'; c++) {
            if(skip.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            int nowIdx = sb.indexOf(String.valueOf(c));
            int newIdx = (nowIdx + index) % sb.length();
            answer.append(sb.charAt(newIdx));
        }
        return answer.toString();
    }
}