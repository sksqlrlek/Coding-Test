import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        
        char[] types = {'R','T','C','F','J','M','A','N'};
        for(char c : types) {
            map.put(c, 0);
        }
        
        for(int i = 0; i < choices.length; i++){
            if(choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            } else if(choices[i] > 4){
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(map.get('R') >= map.get('T') ? "R" : "T");
        sb.append(map.get('C') >= map.get('F') ? "C" : "F");
        sb.append(map.get('J') >= map.get('M') ? "J" : "M");
        sb.append(map.get('A') >= map.get('N') ? "A" : "N");

        return sb.toString();
    }
}