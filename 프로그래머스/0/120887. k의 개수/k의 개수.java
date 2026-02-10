class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char K = (char)('0' + k);
        StringBuilder sb = new StringBuilder();
        for(int n = i; n <= j; n++) {
            sb.append(n);
        }
        
        for(int m = 0; m < sb.length(); m++) {
            if(sb.charAt(m) == K) {
                answer++;
            }
        }
        return answer;
    }
}