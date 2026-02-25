class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            int com = arr1[i] | arr2[i];
            String str = String.format("%" + n + "s", Integer.toString(com, 2));
            String line = str.replace('1', '#').replace('0', ' ');
                                       
            answer[i] = line;
        }
        return answer;
    }
}