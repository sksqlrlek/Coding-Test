class Solution {
    public int solution(int num) {
        long n = num;
        if(num == 1) return 0;
        int cnt = 0;
        while(n != 1) {
            if(cnt == 500){
                return -1;
            }
            if(n % 2 == 0) {
                n /= 2;
                cnt++;
                continue;
            } else {
                n = (n * 3) + 1;
                cnt++;
                continue;
            }
        }
        
        return cnt;
    }
}