import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++) {
            int n = sc.nextInt();
            if(Prime(n)) count++;
        }
        System.out.println(count);
    }
    
    public static boolean Prime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    } 
}