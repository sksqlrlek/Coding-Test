class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            if(divisorCnt(i) > limit) {
                answer += power;
            } else {
                answer += divisorCnt(i);
            }
        }
        return answer;
    }
    
    public int divisorCnt(int num) {
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                if(num / i == i) {
                    cnt++;
                } else {
                    cnt += 2;
                }
            }
        }
        return cnt;
    }
}