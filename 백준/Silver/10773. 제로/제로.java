import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> money = new ArrayDeque<>();
        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i++) {
            int m = Integer.parseInt(br.readLine());
            if(m != 0) {
                money.offer(m);
            } else {
                money.pollLast();
            }
        };
        int sum = money.stream().mapToInt(Integer::intValue).sum();
        System.out.print(sum);
    }
}