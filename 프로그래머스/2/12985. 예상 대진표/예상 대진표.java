class Solution{
    public int solution(int n, int a, int b){
        int round = 1;
        int size = 2;
        
        while(true) {
            int battleA = (a - 1) / size;
            int battleB = (b - 1) / size;
            
            if (battleA == battleB) return round;
            
            size *= 2;
            round++;
        }
    }
}