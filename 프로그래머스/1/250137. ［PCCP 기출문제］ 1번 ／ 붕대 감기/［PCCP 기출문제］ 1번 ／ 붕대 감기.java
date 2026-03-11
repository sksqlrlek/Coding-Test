import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer, Integer> map = new HashMap<>();
        int newHealth = health;
        int cnt = 0;

        for(int i = 0; i < attacks.length; i++) {
            map.put(attacks[i][0], attacks[i][1]);
        }
 
        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if(map.get(i) != null) {
                newHealth -= map.get(i);
                cnt = 0;
            } else {
                newHealth += bandage[1];
                cnt++;
            }
            if(cnt == bandage[0]) {
                newHealth += bandage[2];
                cnt = 0;
            }
            if(newHealth >= health) newHealth = health;
            if(newHealth <= 0) return -1;
        }
        return newHealth;
    }
}