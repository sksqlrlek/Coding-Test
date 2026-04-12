import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue number = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                sb.append((number.isEmpty() ? 0 : number.poll())).append("\n");
            } else {
                number.offer(num);
            }
        }

        System.out.print(sb);
    }
}