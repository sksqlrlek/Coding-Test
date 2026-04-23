import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split("-");
        int[] num = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            String[] group = arr[i].split("\\+");
            for(String g : group) {
                num[i] += Integer.parseInt(g);
            }
        }
        int min = num[0];
        for(int i = 1; i < num.length; i++) {
            min -= num[i];
        }
        System.out.println(min);
    }
}