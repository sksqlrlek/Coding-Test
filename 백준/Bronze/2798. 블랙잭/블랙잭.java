import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        int answer = 0;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = num[i] + num[j] + num[k];
                    if(sum == M) {
                        System.out.print(sum);
                        return;
                    }
                    if(sum < M && answer < sum) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.print(answer);
    }
}