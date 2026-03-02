import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int loster : lost) {
            lostSet.add(loster);
        }
        for(int reserver : reserve) {
            reserveSet.add(reserver);
        }
        
        Set<Integer> both = new HashSet<>(lostSet);
        both.retainAll(reserveSet);
        
        lostSet.removeAll(both);
        reserveSet.removeAll(both);
        
        for(int student : lostSet) {
            if(reserveSet.contains(student - 1)) {
                reserveSet.remove(student - 1);
            } else if (reserveSet.contains(student + 1)) {
                reserveSet.remove(student + 1);
            } else {
                n--;
            }
        }
        return n;
    }
}