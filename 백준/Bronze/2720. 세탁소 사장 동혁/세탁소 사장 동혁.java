import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine());

            sb.append(money / Q).append(" ");
            money = money % Q;
            sb.append(money / D).append(" ");
            money = money % D;
            sb.append(money / N).append(" ");
            money = money % N;
            sb.append(money / P).append("\n");
        }
        
        System.out.println(sb);
    }
}