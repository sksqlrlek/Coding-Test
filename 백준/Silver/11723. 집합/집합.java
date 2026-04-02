import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < M; i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "add": set.add(Integer.parseInt(arr[1])); break;
                case "remove": set.remove(Integer.parseInt(arr[1])); break;
                case "check": sb.append(set.contains(Integer.parseInt(arr[1])) ? 1 : 0).append("\n");
                break;
                case "toggle":
                    int n = Integer.parseInt(arr[1]);
                    if(set.contains(n)) set.remove(n);
                    else set.add(n);
                break;
                case "all":
                    set.clear();
                    for(int k = 1; k <= 20; k++) {
                        set.add(k);
                    }
                break;
                case "empty":
                    set.clear();
                break;
            }
        }
        System.out.println(sb);
    }
}