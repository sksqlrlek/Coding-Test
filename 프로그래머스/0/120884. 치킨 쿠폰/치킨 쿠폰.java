class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int bonus = 0;
        while (coupon >= 10) {
            bonus += coupon / 10;
            coupon = coupon % 10 + coupon / 10;
        }
        return bonus;
    }
}