class Solution {
    boolean solution(String s) {
        int Pp = 0;
        int Yy = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P' || c == 'p') Pp++;
            if(c == 'Y' || c == 'y') Yy++;
        }
        return Pp == Yy;
    }
}