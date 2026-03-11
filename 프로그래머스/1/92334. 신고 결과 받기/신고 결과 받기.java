import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> user = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++) {
            user.put(id_list[i], i);
        }
        
        Set<String> set = new HashSet<>();
        
        for(String x : report) {
            if(!set.add(x)) continue;
            String[] str = x.split(" ");
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);    
        }
        
        for(String y : set) {
            String[] str = y.split(" ");
            if(map.get(str[1]) >= k) {
                answer[user.get(str[0])]++;
            }
        }
        
        return answer;
    }
}