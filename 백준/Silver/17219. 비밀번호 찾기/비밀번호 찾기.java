import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String[] site = br.readLine().split(" ");
            map.put(site[0], site[1]);
        }
        for(int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}