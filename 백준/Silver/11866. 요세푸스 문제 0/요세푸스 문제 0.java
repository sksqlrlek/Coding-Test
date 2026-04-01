import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(i + 1);
        }
        sb.append("<");
        int idx = 0;
        for(int i = 1; i < N; i++) {
            idx = (idx + K - 1) % list.size();
            sb.append(list.get(idx)).append(", ");
            list.remove(idx);
        }
        sb.append(list.get(0)).append(">");
        System.out.println(sb);
    }
}