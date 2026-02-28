import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] count = new int[N + 2];
        
        for(int stage : stages) {
            count[stage]++;
        }
        
        int total = stages.length;
        
        HashMap<Integer, Double> map = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            if(total == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double)count[i] / total);
                total -= count[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            if(map.get(b).equals(map.get(a))) {
                return a - b;
            }
            return Double.compare(map.get(b), map.get(a));
        });
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}