class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++) {
            int cnt = 0;
            int limitTime = schedules[i] + 10;
            if(limitTime % 100 >= 60) limitTime += 40;
            for(int j = 0; j < timelogs[i].length; j++) {
                int day = (j + startday) % 7;
                if((day != 6 && day != 0) &&
                   limitTime >= timelogs[i][j]) {
                    cnt++;
                }
            }
            if(cnt == 5) answer++;
        }
        return answer;
    }
}