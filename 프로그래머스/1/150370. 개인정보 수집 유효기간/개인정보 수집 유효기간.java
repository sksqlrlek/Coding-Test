import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(String term : terms) {
            String[] t = term.split(" ");
            map.put(t[0], Integer.parseInt(t[1]));
        }
        int todayNumber = toDay(today);
        
        for(int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int month = map.get(privacy[1]) * 28;
            
            int deadLine = toDay(privacy[0]) + month;
            
            if(deadLine <= todayNumber) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
    
    public int toDay(String day) {
        String[] str = day.split("\\.");
        return (Integer.parseInt(str[0]) * 12 * 28) 
            + (Integer.parseInt(str[1]) * 28) 
            + Integer.parseInt(str[2]);
        
    }
}