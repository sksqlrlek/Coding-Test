import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visited = new boolean[n][m];
        Queue<Node> q = new LinkedList<>();
        
        q.add(new Node(0, 0, 1));
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            Node current = q.poll();
            
            if(current.x == n - 1 && current.y == m -1) {
                return current.dist;
            }
            
            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];
                
                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    if(maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        
                        q.add(new Node(nextX, nextY, current.dist + 1));
                    }
                }
            }
        }        
        
        return -1;
    }
}

class Node {
    int x, y, dist;

    Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
    