class Solution {
    public long solution(int n) {
        
        if (n <= 1) return n;
        long current = 0;
        long prevTwo = 1;
        long prevOne = 1;
        
        for(int i = 2; i <= n; i++) {
            current = (prevTwo + prevOne) % 1234567;
            prevTwo = prevOne;
            prevOne = current;
        }
        
        return current;
    }
}