class Solution {
    boolean solution(String s) {
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            if(idx < 0) return false;
            if(s.charAt(i) == '(') idx++;
            if(s.charAt(i) == ')') idx--;
            
        }

        return idx == 0 ? true : false;
    }
}