class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for(int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}