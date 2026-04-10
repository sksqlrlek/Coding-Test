import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> bridge = new ArrayDeque<>();
        int idx = 0;
        int nowWeight = 0;
        for(int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        while(idx < truck_weights.length) {
            answer++;
            nowWeight -= bridge.poll();
            
            if(nowWeight + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                nowWeight += truck_weights[idx];
                idx++;
            } else {
                bridge.offer(0);
            }
        }
        return answer + bridge_length;
    }
}