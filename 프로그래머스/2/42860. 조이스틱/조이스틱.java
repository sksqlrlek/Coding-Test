class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len - 1; // 오른쪽으로 쭉 가기
        for(int i = 0; i < len; i++) {
            answer += upDown(name.charAt(i));
            
            int next = i + 1;
            while(next < len && name.charAt(next) == 'A') {
                next++;
            }// A 아닌 것 찾기
            
            move = Math.min(move, (i * 2) + (len - next)); // 오른쪽으로 A 아닌 것 찾기 vs 오른쪽 갔다가 왼쪽으로 가기
            move = Math.min(move, (len - next) * 2 + i); // vs 왼쪽으로 가기

        }
        return answer + move;
    }
    
    // 방향키 위아래 조절
    public int upDown(char alpa) {
        if(alpa == 'A') return 0;
        return Math.min(alpa - 'A', 'Z' - alpa + 1);
    }
}