class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length == arr[0].length) {
            return arr;
        }
        int n = arr.length > arr[0].length ? arr.length : arr[0].length;
        int[][] answer = new int[n][n];

        for(int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
    
        return answer;
    }
}