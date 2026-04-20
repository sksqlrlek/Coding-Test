import java.util.*;

class Solution {
    int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        //최저 비용을 위해 오름차순 정렬
        Arrays.sort(costs, (x, y) -> Integer.compare(x[2], y[2]));
        
        parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        int edges = 0;
        for(int[] cost : costs) {
            // 다 돌았으면 종료
            if(edges == n - 1) break;
            
            if(find(cost[0]) != find(cost[1])) {
                union(cost[0], cost[1]);
                answer += cost[2];
                edges++;
            }
        }
        
        return answer;
    }
    
    // x의 최고 부모의 찾음
    public int find(int x) {
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    //  x와 y의 그룹을 합침
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if(rootX != rootY) parent[rootY] = rootX;
    }
}