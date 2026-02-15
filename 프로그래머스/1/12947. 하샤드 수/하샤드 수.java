class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(String a : arr) {
            sum += Integer.parseInt(a);
        }
        if (x % sum == 0) {
            return true;
        }
        return false;
    }
}