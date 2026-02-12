class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int n = (total - (num * (num - 1) / 2)) / num;
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = n + i;
        }
        
        return answer;
    }
}