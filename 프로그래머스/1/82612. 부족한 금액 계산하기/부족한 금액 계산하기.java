class Solution {
    public long solution(int price, int money, int count) {
        long pay = 0;
        for(int i = 1; i <= count; i++) {
            pay += i * price;
        }
        return money >= pay ? 0 : Math.abs(pay - money);
    }
}