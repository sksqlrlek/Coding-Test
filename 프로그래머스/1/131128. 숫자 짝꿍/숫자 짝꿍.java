import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xList = new int[10];
        int[] yList = new int[10];
        StringBuilder sb = new StringBuilder();
        for(char c : X.toCharArray()) {
            xList[c - '0']++;
        }
        for(char c : Y.toCharArray()) {
            yList[c - '0']++;
        }
        for(int i = 9; i >= 0; i--) {
            int min = Math.min(xList[i], yList[i]);
            
            for(int j = 1; j <= min; j++) {
                sb.append(i);
            }
        }
        
        if(sb.length() == 0) return "-1";
        if(sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}