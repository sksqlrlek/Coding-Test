import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int cnt : tangerine) {
            map.put(cnt, map.getOrDefault(cnt, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        
        list.sort(Collections.reverseOrder());
        int count = 0;
        for(int cnt : list) {
            count += cnt;
            answer++;
            if(count >= k) break;
        }
        return answer;
    }
}