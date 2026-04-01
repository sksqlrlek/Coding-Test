import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.MAX_VALUE;
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        
        for(int i = 0; i <= N - 8; i++) {
            for(int j = 0; j <= M - 8; j++) {
                int wCnt = 0;
                int bCnt = 0;
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (board[x][y] != 'W') wCnt++;
                        } else {
                            if (board[x][y] != 'B') wCnt++;
                        }
                        if ((x + y) % 2 == 0) {
                            if (board[x][y] != 'B') bCnt++;
                        } else {
                            if (board[x][y] != 'W') bCnt++;
                        }
                    }
                }
                answer = Math.min(answer, Math.min(wCnt, bCnt));
            }
        }
        System.out.println(answer);
    }
}