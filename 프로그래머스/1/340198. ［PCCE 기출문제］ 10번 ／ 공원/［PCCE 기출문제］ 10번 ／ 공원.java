import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int w = park.length;
        int h = park[0].length;
        
        Arrays.sort(mats);
        
        for(int l = mats.length - 1; l >= 0; l--) {
            int mat = mats[l];
            for(int i = 0; i <= w - mat; i++) {
                for(int j = 0; j <= h - mat; j++) {
                    boolean possible = true;
                    for (int n = i; n < i + mat; n++) {
                        for (int m = j; m < j + mat; m++) {
                            if (!park[n][m].equals("-1")) {
                                possible = false;
                                break;
                            }
                        }
                        if(!possible) break;
                    }
                    if(possible) return mat;
                }
            }
        }
        return -1;
    }
}