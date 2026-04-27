import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        int[][] hw = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            hw[i][0] = Integer.parseInt(arr[0]);
            hw[i][1] = Integer.parseInt(arr[1]);
        }

        Arrays.sort(hw, (a, b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            return b[0] - a[0];
        });

        int idx = 0;
        int score = 0;
        for(int i = hw[0][0]; i >= 1; i--) {
            while(idx < N && hw[idx][0] >= i ) {
                pq.add(hw[idx][1]);
                idx++;
            }

            if(!pq.isEmpty()) {
                score += pq.poll();
            }
        }
        System.out.println(score);
    }
}