import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        for(int num : numbers) {
            list.remove(Integer.valueOf(num));
        }
        
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}