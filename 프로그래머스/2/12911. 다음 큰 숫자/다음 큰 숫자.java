class Solution {
    public int solution(int n) {
        String binaryN = Integer.toBinaryString(n);
        int nCnt = 0;
        
        for(char c : binaryN.toCharArray()){
            if(c == '1')  nCnt++;
        }
        
        while(true){
            n++;
            String newBinaryN = Integer.toBinaryString(n);
            int newNCnt = 0;
            for(char c : newBinaryN.toCharArray()){
                if(c == '1')  newNCnt++;
            }
            if(nCnt == newNCnt) break;
        }
        return n;
    }
}