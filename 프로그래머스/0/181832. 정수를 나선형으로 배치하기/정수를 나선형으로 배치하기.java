class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] row = {0, 1, 0, -1}; 
        int[] col = {1, 0, -1, 0};
        int r = 0;
        int c = 0;
        int dir = 0;
        
        for(int i = 1; i <= n * n; i++) {
            answer[r][c] = i;
            
            int nextR = r + row[dir];
            int nextC = c + col[dir];
            
            if(nextR < 0 || nextR >= n || nextC < 0 || nextC >= n || answer[nextR][nextC] != 0){
                dir = (dir + 1) % 4;
                nextR = r + row[dir];
                nextC = c + col[dir];
            }
            
            r = nextR;
            c = nextC;
        }
        return answer;
    }
}