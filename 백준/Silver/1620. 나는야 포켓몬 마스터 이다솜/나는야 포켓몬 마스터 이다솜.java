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
        String[] number = new String[N];
        Map<String, Integer> map = new HashMap<>();      
        for(int i = 0; i < N; i++) {
            String poke = br.readLine();
            number[i] = poke;
            map.put(poke, i + 1);
        }
        for(int i = 0; i < M; i++) {
            String poke = br.readLine();
            if(poke.charAt(0) >= '0' && poke.charAt(0) <= '9') {
                int pokeNum = Integer.parseInt(poke);
                sb.append(number[pokeNum - 1]).append("\n");
            } else {
                sb.append(map.get(poke)).append("\n");
            }
        }
        System.out.println(sb);
    }
}