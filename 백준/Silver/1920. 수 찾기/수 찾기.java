import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(String s : br.readLine().split(" ")) {
            set.add(Integer.parseInt(s));
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(String num : br.readLine().split(" ")) {
            int a = Integer.parseInt(num);
            sb.append(set.contains(a) ? 1 : 0).append("\n");
        }
        System.out.println(sb);
        
    }
}