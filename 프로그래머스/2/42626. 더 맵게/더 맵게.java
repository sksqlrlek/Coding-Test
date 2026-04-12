import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> food = new PriorityQueue<>();
        for(int s : scoville) {
            food.offer(s);
        }
        while(!food.isEmpty() && food.peek() < K) {
            if(food.size() <= 1) return -1;
            int a = food.poll();
            int b = food.poll();
            food.offer(a + (b * 2));
            answer++;
        }
        return answer;
    }
}