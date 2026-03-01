class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int high = 0;
        int low = 0;
        for(int lotto : lottos) {
            if(lotto == 0) high++;
            for(int win : win_nums) {
                if(lotto == win) {
                    low++;
                    high++;
                }
            }
        }
        answer[0] = high <= 1 ? 6 : (7 - high);
        answer[1] = low <= 1 ? 6 : (7 - low);
        
        return answer;
    }
}