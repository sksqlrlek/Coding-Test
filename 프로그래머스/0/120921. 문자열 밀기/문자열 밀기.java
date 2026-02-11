class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        
        int n = A.length();
        for(int i = 1; i <= n; i++) {
            String change = A.substring(n - i) + A.substring(0, n - i);
            if(change.equals(B)) {
                return i;
            }
        }
        return -1;
    }
}