class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekDay = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int day = b - 1;
        for(int i = 0; i < a - 1; i++) {
            day += month[i];
        }
        return weekDay[day % 7];
    }
}