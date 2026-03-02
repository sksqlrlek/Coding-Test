import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        for(String complete : completion) {
            map.put(complete, map.get(complete) - 1);
        }
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                return key;
            }
        }
        return "";
    }
}