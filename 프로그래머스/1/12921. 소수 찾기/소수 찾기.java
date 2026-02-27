class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i >= 2; i--) {
            answer += check(i) ? 1 : 0;
        }
        return answer;
    }
    
    public boolean check(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}