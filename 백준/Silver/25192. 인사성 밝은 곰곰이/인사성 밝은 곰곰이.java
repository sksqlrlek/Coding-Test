import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            String user = br.readLine();
            if("ENTER".equals(user)) {
                cnt += set.size();
                set.clear();
            } else {
                set.add(user);
            }
        }
        cnt += set.size();
        
        System.out.println(cnt);
    }
}