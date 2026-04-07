import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(day);
        }
        int cnt = 1;
        int days = q.poll();
        while(!q.isEmpty()) {
            if(q.peek() <= days) {
                q.poll();
                cnt++;
            } else {
                list.add(cnt);
                days = q.poll();
                cnt = 1;
            }
        }
        list.add(cnt);
        return list.stream().mapToInt(x -> x).toArray();
    }
}