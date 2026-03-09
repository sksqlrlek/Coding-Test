class Solution {
    public int[] solution(String[] park, String[] routes) {
        int w = park.length;
        int h = park[0].length();
        int x = 0;
        int y = 0;
        for(int i = 0; i < w; i++) {
            for(int j = 0; j < h; j++) {
                if(park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        for(String route : routes) {
            String[] routeStr = route.split(" ");
            String dir = routeStr[0];
            int num = Integer.parseInt(routeStr[1]);
            int testX = x;
            int testY = y;
            boolean possible = true;
            
            for(int i = 1; i <= num; i++) {
                if(dir.equals("N")) {
                    testX--;
                } else if(dir.equals("S")) {
                    testX++;
                } else if(dir.equals("W")) {
                    testY--;
                } else if(dir.equals("E")) {
                    testY++;
                }
                
                if(testY < 0 || testY >= h || testX < 0 || testX >= w) {
                    possible = false;
                    break;
                }
                if(park[testX].charAt(testY) == 'X') {
                    possible = false;
                    break;
                }
                
            }
            if(possible) {
                x = testX;
                y = testY;
            }
        }
        return new int[]{x, y};
    }
}