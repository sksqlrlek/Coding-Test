import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[][] lecture = new int[N][2];
        int pay = 0;
        int lectureNum = 0;

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            lecture[i][0] = Integer.parseInt(input[0]);
            lecture[i][1] = Integer.parseInt(input[1]);
        }
        
        Arrays.sort(lecture, (a, b) -> b[1] - a[1]);

        for(int i = 10000; i >= 1; i--) {
            while(lectureNum < N && lecture[lectureNum][1] >= i) {
                pq.add(lecture[lectureNum][0]);
                lectureNum++;
            } 

            if(!pq.isEmpty()) {
                pay += pq.poll();
            }
        }
        System.out.println(pay);
    }
}