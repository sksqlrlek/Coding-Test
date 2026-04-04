import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[10001];
        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            nums[n]++;
        }
        for(int i = 1; i <= 10000; i++) {
            while(nums[i] > 0) {
                sb.append(i).append("\n");
                nums[i]--;
            }
        }
        System.out.println(sb);
    }
}