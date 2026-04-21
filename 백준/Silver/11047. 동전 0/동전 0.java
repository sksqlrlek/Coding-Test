import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        int[] token = new int[N];
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            token[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N - 1; i >= 0; i--) {
            if(K == 0) break;
            cnt += K / token[i];
            K = K % token[i];
        }

        System.out.println(cnt);
    }
}