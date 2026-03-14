class Solution {
    public int solution(int[][] signals) {
        int cnt = signals.length;
        int lcm = 1;
        
        for(int[] signal : signals) {
            int cycle = signal[0] + signal[1] + signal[2];
            lcm = lcm(lcm, cycle);
        }
        
        for(int i = 1; i <= lcm; i++) {
            boolean flag = true;
            
            for(int[] signal : signals) {
                int g = signal[0];
                int y = signal[1];
                int r = signal[2];
                
                int cycle = g + y + r;
                int now = (i - 1) % cycle + 1;
                
                if(!(now > g && now <= g + y)) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) return i;
        }
        return -1;
    }
    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}