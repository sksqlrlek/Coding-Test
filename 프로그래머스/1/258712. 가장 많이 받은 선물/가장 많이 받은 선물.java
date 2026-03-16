import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }

        int[][] giftMatrix = new int[n][n];
        int[] giftIndex = new int[n];

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            int giver = map.get(split[0]);
            int receiver = map.get(split[1]);

            giftMatrix[giver][receiver]++;
            giftIndex[giver]++;
            giftIndex[receiver]--;
        }

        int maxGifts = 0;
        
        for(int i = 0; i < n; i++) {
            int CurrentGifts = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                
                if(giftMatrix[i][j] > giftMatrix[j][i]) {
                    CurrentGifts++;
                } else if(giftMatrix[i][j] == giftMatrix[j][i]) {
                    if(giftIndex[i] > giftIndex[j]) {
                        CurrentGifts++;
                    }                     
                }
            }
            maxGifts = Math.max(maxGifts, CurrentGifts);
        }
        return maxGifts;
    }
}