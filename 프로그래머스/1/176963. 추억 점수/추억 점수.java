import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            for(String str : photo[i]) {
                sum += map.getOrDefault(str, 0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}