import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            switch(arr[0]) {
                case "1": q.push(Integer.parseInt(arr[1])); continue;
                case "2": sb.append(q.isEmpty() ? -1 : q.poll()); break;
                case "3": sb.append(q.size()); break;
                case "4": sb.append(q.isEmpty() ? 1 : 0); break;
                case "5": sb.append(q.isEmpty() ? -1 : q.peek());break;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}