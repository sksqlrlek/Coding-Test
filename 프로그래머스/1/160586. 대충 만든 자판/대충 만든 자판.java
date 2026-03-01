class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            int cnt = 0;
            boolean impossible = false;
            for(int j = 0; j < targets[i].length(); j++) {
                int min = Integer.MAX_VALUE;
                for(int l = 0; l < keymap.length; l++) {
                    if(keymap[l].indexOf(targets[i].charAt(j)) != -1) {
                        min = Math.min(min, keymap[l].indexOf(targets[i].charAt(j)) + 1);
                    }
                }
                if(min == Integer.MAX_VALUE) {
                    impossible = true;
                    break;
                }    
                cnt += min;
            }
            answer[i] = impossible ? -1 : cnt;
        }
        return answer;
    }
}
