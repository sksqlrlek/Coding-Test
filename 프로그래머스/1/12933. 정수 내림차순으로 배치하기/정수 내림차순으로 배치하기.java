import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr, Comparator.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(String a : arr) {
            sb.append(a);
        }
        return Long.parseLong(sb.toString());
    }
}