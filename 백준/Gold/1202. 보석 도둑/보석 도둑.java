import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        int[][] jewels = new int[N][2];
        int[] bags = new int[K];
        // 내림차 순
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        int jewelNum = 0;
        for(int i = 0; i < N; i++) {
            String[] jewel = br.readLine().split(" ");
            jewels[i][0] = Integer.parseInt(jewel[0]);   
            jewels[i][1] = Integer.parseInt(jewel[1]);   
        }
        for(int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());   
        }

        // 보석, 가방 무게 순으로 정렬
        Arrays.sort(jewels, (a, b) -> a[0] - b[0]);
        Arrays.sort(bags);


        for(int i = 0; i < K; i ++) {
            // 가방에 들어갈 수 있는 보석 다 넣어보기
            while (jewelNum < N && jewels[jewelNum][0] <= bags[i]) {
                pq.add(jewels[jewelNum][1]);
                jewelNum++;
            }

            // 가방에 있는 것 중 가장 비싼 것 하나만 꺼내기
            if(!pq.isEmpty()){
                sum += pq.poll();
            }
        }
        System.out.println(sum);
    }
}