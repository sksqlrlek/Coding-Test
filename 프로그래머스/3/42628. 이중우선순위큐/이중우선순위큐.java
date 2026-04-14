import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(String oper : operations) {
            String[] str = oper.split(" ");
            int value = Integer.parseInt(str[1]);
            if(str[0].equals("I")) {
                map.put(value, map.getOrDefault(value, 0) + 1);
            } else {
                if(map.isEmpty()) continue;
                int key = value == 1 ? map.lastKey() : map.firstKey();
                if(map.get(key) > 1) {map.put(key, map.get(key) - 1);}
                else {map.remove(key);}
            }
        }
        return map.isEmpty() ? new int[]{0, 0} : new int[]{map.lastKey(), map.firstKey()};
    }
}