class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);
        for(String str : strArr) {
            int num = Integer.parseInt(str);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        return min + " " + max;
    }
}