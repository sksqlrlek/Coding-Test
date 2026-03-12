class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoTime = Integer.parseInt(video_len.substring(0,2)) * 60 
            + Integer.parseInt(video_len.substring(3,5));
        int posTime = Integer.parseInt(pos.substring(0,2)) * 60 
            + Integer.parseInt(pos.substring(3,5));
        int startTime = Integer.parseInt(op_start.substring(0,2)) * 60 
            + Integer.parseInt(op_start.substring(3,5));
        int endTime = Integer.parseInt(op_end.substring(0,2)) * 60 
            + Integer.parseInt(op_end.substring(3,5));
        
        for(String command : commands) {
            if(posTime >= startTime && posTime <= endTime) posTime = endTime;
            switch(command) {
                case "prev" :
                    posTime -= 10;
                    if(posTime < 0) posTime = 0;
                    break;
                case "next" :
                    posTime += 10;
                    if(posTime > videoTime) posTime = videoTime;
                    break;
            }
            if(posTime >= startTime && posTime <= endTime) posTime = endTime;
        }
        
        return String.format("%02d:%02d", posTime/60, posTime%60);
    }
}