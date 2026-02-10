class Solution {
    public int solution(String before, String after) {
        int[] arr = new int[26];
        for(int i = 0; i < before.length(); i++) {
            arr[before.charAt(i) - 'a']--;
            arr[after.charAt(i) - 'a']++;
        }
        for(int n : arr) {
            if(n != 0) {
                return 0;
            }
        }
        
        return 1;
    }
}