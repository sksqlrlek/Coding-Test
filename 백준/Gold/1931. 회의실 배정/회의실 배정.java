import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<int[]> meetings = new ArrayList<>();
        int count = 0;
        int end = 0;
        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            meetings.add(new int[]{Integer.parseInt(arr[0]), Integer.parseInt(arr[1])});
        }

        meetings.sort((a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for(int i = 0; i < N; i++) {
            if(meetings.get(i)[0] >= end) {
                count++;
                end = meetings.get(i)[1];
            }
        };
        System.out.println(count);
    }
}