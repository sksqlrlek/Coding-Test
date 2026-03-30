import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push": st.push(Integer.parseInt(arr[1])); break;
                case "pop": 
                    if(st.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(st.pop()).append("\n");
                    }
                    break;
                case "size": sb.append(st.size()).append("\n"); break;
                case "empty": if(st.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "top": 
                    if(st.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(st.peek()).append("\n");
                    }
                    break;
                default: break;
            }
        }   
        System.out.println(sb);
    }
}