import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int p1 = 0; 
        int p2 = 0;
        int p3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i % one.length]) p1++;
            if(answers[i] == two[i % two.length]) p2++;
            if(answers[i] == thr[i % thr.length]) p3++;
        }
        
        int max = Math.max(p1, Math.max(p2, p3));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(max == p1) list.add(1);
        if(max == p2) list.add(2);
        if(max == p3) list.add(3);
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}