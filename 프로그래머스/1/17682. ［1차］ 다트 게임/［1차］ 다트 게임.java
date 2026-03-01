import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int[] answer = new int[3];
        
        Pattern p = Pattern.compile("(10|[0-9])([SDT])([*#]?)");
        Matcher m = p.matcher(dartResult);
        int idx = 0;
        
        while(m.find()) {
            int num = Integer.parseInt(m.group(1));
            String bonus = m.group(2);
            String option = m.group(3);
            
            if(bonus.equals("D")) {
                num = (int)Math.pow(num, 2);
            } else if(bonus.equals("T")) {
                num = (int)Math.pow(num, 3);
            }
            
            if(option.equals("*")) {
                num *= 2;
                if(idx > 0) {
                    answer[idx - 1] *= 2;
                }
            } else if(option.equals("#")) {
                num *= -1;
            }
            answer[idx++] = num;
        }
        
        return Arrays.stream(answer).sum();
    }
}