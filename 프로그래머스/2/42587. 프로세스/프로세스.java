import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> q = new ArrayDeque<>();
        for(int i = 0; i < priorities.length; i++) {
            q.offer(new int[]{priorities[i], i});
        }
        int answer = 0;
        while(!q.isEmpty()) {
            int[] num = q.poll();
            boolean higher = false;
            for(int[] n : q) {
                if(num[0] < n[0]) {
                    higher = true;
                    break;
                }
            }
            if(higher) {
                q.offer(num);
            } else {
                answer++;
                if(num[1] == location) {
                    return answer;
                }   
            }
        }
        return answer;
    }
}