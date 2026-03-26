import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++) {
            int score = sc.nextInt();
            arr[i] = score;
            if(max < score) max = score;
        }
        double sum = 0;
        for(int score : arr) {
            sum += (double)score / max * 100;
        }
        System.out.println(sum / N);
    }
}