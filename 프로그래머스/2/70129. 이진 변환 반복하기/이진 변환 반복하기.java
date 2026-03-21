class Solution {
    public int[] solution(String s) {
        int change = 0;
        int xCnt = 0;
        while (!(s.equals("1"))) {
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()) {
                if(c == '0') xCnt++;
                else if(c == '1') sb.append(c);
            }
            s = Integer.toBinaryString(sb.length());
            change++;
        }
        return new int[]{change, xCnt};
    }
}