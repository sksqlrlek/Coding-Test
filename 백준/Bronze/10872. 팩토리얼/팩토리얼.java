import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long f = 1;
        
        for (int i = 1; i <= N; i++) {
            f *= i;
        }
        
        System.out.println(f);
    }
}