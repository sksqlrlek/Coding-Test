import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] order = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < order.length; i++) {
           list.add(Integer.parseInt(order[i])); 
        }
        
        Collections.sort(list);

        int sum = 0;
        int cuSum = 0;

        for(int i = 0; i < list.size(); i++) {
            cuSum += list.get(i);
            sum += cuSum;
        }

        System.out.println(sum);
    }
}