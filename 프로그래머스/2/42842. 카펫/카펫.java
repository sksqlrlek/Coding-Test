class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int size = brown + yellow;
        for(int h = 2; h <= size / 2; h++) {
            if (size % h == 0) {
                int w =  size / h;
                if ((w - 2) * (h - 2) == yellow) {
                    return new int[]{w, h};
                }
            }
        }
        return new int[]{0, 0};
    }
}