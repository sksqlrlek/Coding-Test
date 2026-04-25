import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[][] classroom = new int[N][2];
        
        for(int i = 0; i < N; i++){
            String[] arr = br.readLine().split(" ");
            classroom[i][0] = Integer.parseInt(arr[0]);
            classroom[i][1] = Integer.parseInt(arr[1]);
        }

        Arrays.sort(classroom, (a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        pq.add(classroom[0][1]);

        for(int i = 1; i < N; i++) {
            if(pq.peek() <= classroom[i][0]) {
                pq.poll();
            }
            pq.add(classroom[i][1]);
        }
        System.out.println(pq.size());
    }
}