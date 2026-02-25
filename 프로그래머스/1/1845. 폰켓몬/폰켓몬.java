import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.size() >= nums.length / 2) {
                break;
            }
            set.add(nums[i]);            
        }
        return set.size();
    }
}