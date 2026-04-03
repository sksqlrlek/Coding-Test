import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        Set<String> set = new HashSet<>();
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(set.contains(s)) answer.add(s);
        }
        Collections.sort(answer);
        
        sb.append(answer.size()).append("\n");
        for(String s : answer) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}