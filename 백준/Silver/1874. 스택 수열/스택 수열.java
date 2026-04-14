import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            
            while (cnt <= target) {
                st.push(cnt);
                sb.append("+\n");
                cnt++;
            }

            if(!st.isEmpty() && st.peek() == target) {
                st.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}