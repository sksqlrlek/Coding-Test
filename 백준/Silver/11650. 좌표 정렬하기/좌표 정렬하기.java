import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Position> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            list.add(new Position(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
        }        
        list.sort(Comparator.comparingInt((Position p) -> p.x)
                            .thenComparingInt(p -> p.y));

        StringBuilder sb = new StringBuilder();
        for(Position p : list) {
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }

        System.out.println(sb);
    }

    public static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}