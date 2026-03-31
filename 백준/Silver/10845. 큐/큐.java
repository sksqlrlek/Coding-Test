import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push": q.add(Integer.parseInt(arr[1])); break;
                case "pop": 
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.poll()).append("\n"); 
                    }
                    break;
                case "size": sb.append(q.size()).append("\n"); break;
                case "empty": sb.append(q.isEmpty() ? 1 : 0).append("\n"); break;
                case "front": 
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.peek()).append("\n"); 
                    }
                    break;
                case "back": 
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.peekLast()).append("\n"); 
                    }
                    break;
                default: break;
            }
        }
        System.out.println(sb);
    }
}