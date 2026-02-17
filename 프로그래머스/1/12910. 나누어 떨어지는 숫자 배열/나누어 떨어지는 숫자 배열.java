import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) {
            if(num % divisor == 0) {
                list.add(num);
            }
        }
        if(list.size() == 0) {
            return new int[]{-1};
        } 
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}