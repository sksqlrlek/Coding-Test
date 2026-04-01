import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int n = elements.length;
        int[] nums = new int[n * 2];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n * 2; i++) {
            nums[i] = elements[i % n];
        }
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = 0; j < i; j++) {
                sum += nums[j];
            }
            set.add(sum);
            for(int l = 1; l < n; l++) {
                sum -= nums[l - 1];
                sum += nums[l + i - 1];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}