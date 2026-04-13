import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int idx = 0;
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> work = new PriorityQueue<>(
             (a, b) -> {
                if (a[1] != b[1]) return a[1] - b[1];
                return a[0] - b[0];
            }
        );
        
        while(idx < jobs.length || !work.isEmpty()) {
            while(idx < jobs.length && jobs[idx][0] <= time) {
                work.offer(jobs[idx]);
                idx++;
            }
            if(!work.isEmpty()) {
                int[] job = work.poll();
                time += job[1];
                answer += (time - job[0]);
            } else {
                time = jobs[idx][0];
            }
        }
        return answer / jobs.length;
    }
}