class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int height = (n + w - 1) / w;
        int[][] box = new int[height][w];
        
        for(int i = 1; i <= n; i++) {
            int row = (i - 1) / w;
            int number = (i - 1) % w;
            
            if(row % 2 == 1) {
                number = w - 1 - number;
            }
            
            box[row][number] = i;
        }
        
        int targetRow = 0;
        int targetNumber = 0;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < w; j++) {
                if(box[i][j] == num) {
                    targetRow = i;
                    targetNumber = j;
                }
            }
        }
        
        for(int i = targetRow; i < height; i++) {
            if(box[i][targetNumber] != 0) answer++;
        }
        return answer;
    }
}