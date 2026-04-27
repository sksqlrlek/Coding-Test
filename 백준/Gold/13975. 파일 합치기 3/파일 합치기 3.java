import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();
            String[] arr = br.readLine().split(" ");
            long sum = 0;
            for(int j = 0; j < arr.length; j++) {
                pq.add(Long.parseLong(arr[j]));
            }

            while(pq.size() > 1) {
                long first = pq.poll();
                long second = pq.poll();
                sum += first + second;
                pq.add(first + second);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}