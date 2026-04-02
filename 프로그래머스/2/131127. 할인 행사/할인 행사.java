import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        for(int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> copy = new HashMap<>(wantMap);
            for(int j = i; j < i + 10; j++) {
                if(copy.containsKey(discount[j])) {
                    copy.put(discount[j], copy.get(discount[j]) - 1);
                    if(copy.get(discount[j]) == 0) {
                        copy.remove(discount[j]);
                    }
                }
            }
            if(copy.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}