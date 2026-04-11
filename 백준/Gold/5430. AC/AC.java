import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String p = br.readLine();
            Deque<Integer> dq = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            if (n > 0) {
                String[] arr = str.substring(1, str.length() - 1).split(",");
                for (String s : arr) {
                    dq.offer(Integer.parseInt(s));
                }
            }
            boolean reversed = false;
            boolean isError = false;
            for(char c : p.toCharArray()) {
                if (c == 'R') {
                    reversed = !reversed;
                } else {
                    if (dq.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if(!reversed) {
                        dq.pollFirst();
                    } else {
                        dq.pollLast();
                    }
                }
            }
            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("[");
                while (!dq.isEmpty()) {
                    sb.append(reversed ? dq.pollLast() : dq.pollFirst());
                    if (!dq.isEmpty()) sb.append(",");
                }
                sb.append("]\n");
            }
        }
        System.out.println(sb);
    }
}