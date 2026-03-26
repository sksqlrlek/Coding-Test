import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int Binomial = Facto(N) / (Facto(K) * Facto(N - K));
        System.out.println(Binomial);
    }

    public static int Facto(int a) {
        int result = 1;
        while(a > 0) {
            result *= a;
            a--;    
        }
        return result;
    }
}