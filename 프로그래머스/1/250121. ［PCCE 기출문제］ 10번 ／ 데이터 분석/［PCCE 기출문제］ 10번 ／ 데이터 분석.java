import java.util.ArrayList;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extNum;
        int sortNum;
        ArrayList<int[]> list = new ArrayList<>();
        switch(ext) {
            case "code": extNum = 0; break;
            case "date": extNum = 1; break;
            case "maximum": extNum = 2; break;
            case "remain": extNum = 3; break;
            default: extNum = 0;
        }
        switch(sort_by) {
            case "code": sortNum = 0; break;
            case "date": sortNum = 1; break;
            case "maximum": sortNum = 2; break;
            case "remain": sortNum = 3; break;
            default: sortNum = 0;
        }
        
        for(int i = 0; i < data.length; i++) {
            if(data[i][extNum] < val_ext) {
                list.add(data[i]);
            }
        }
        
        list.sort((a, b) -> Integer.compare(a[sortNum], b[sortNum]));        
        
        int[][] answer = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}