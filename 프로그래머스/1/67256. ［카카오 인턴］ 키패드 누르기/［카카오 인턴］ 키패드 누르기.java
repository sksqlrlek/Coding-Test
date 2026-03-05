class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        
        for(int num : numbers) {
            if(num == 0) num = 11;
            if(num == 1 || num == 4 || num == 7) {
                left = num;
                sb.append("L");
            } else if(num == 3 || num == 6 || num == 9){
                right = num;
                sb.append("R");
            } else {
                int Lleng = Math.abs(left - num) / 3 + Math.abs(left - num) % 3;
                int Rleng = Math.abs(right - num) / 3 + Math.abs(right - num) % 3;
                if(Lleng < Rleng || (Lleng == Rleng && hand.equals("left"))) {
                    left = num;
                    sb.append("L");
                } else {
                    right = num;
                    sb.append("R");
                }
            }
        }
        return sb.toString();
    }
}