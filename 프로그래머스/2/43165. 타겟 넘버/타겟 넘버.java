class Solution {
         
    static int count = 0;
    
    public int solution(int[] numbers, int target) {
        count = 0;
        
        dfs(numbers, target, 0, 0);
        
        return count;
    }
    
    private void dfs(int[] numbers, int target, int depth, int sum) {
        if(numbers.length == depth) {
            if(sum == target) count++;
            return;
        }
        
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    } 
}