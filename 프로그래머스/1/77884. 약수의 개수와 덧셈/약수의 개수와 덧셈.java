class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(factor(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    public int factor(int a) {
        int fact = 0;
        for(int i = 1; i * i <= a; i++) {
            if(a % i == 0) {
                if(i * i == a) {
                    fact++;
                }else {
                    fact += 2;
                }
            }
        }
        return fact;
    }
}