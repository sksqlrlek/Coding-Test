import java.util.Set;
import java.util.HashSet;

class Solution {
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        
        logic("", numbers);
        
        for(int num : set) {
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    public void logic(String now, String others) {
        if(!now.equals("")) set.add(Integer.parseInt(now));
        
        for(int i = 0; i < others.length(); i++) {
            logic(now + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
    
    public boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}