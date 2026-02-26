import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int m, int[] section) {
        List<Integer> list = Arrays.stream(section).boxed().collect(Collectors.toList());
        int cnt = 0;
        while(list.size() > 0) {
            int start = list.get(0);
            list.removeIf(x -> x < start + m);
            cnt++;
        }
        return cnt;
    }
}