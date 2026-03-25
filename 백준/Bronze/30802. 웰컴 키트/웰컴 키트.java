import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt(); 
        int L = sc.nextInt();
        int XL = sc.nextInt();
        int XXL = sc.nextInt();
        int XXXL = sc.nextInt();
        int T = sc.nextInt();
        int P = sc.nextInt();
       
        int sum = count(S, T) + count(M, T) + count(L, T) + count(XL, T) + count(XXL, T) + count(XXXL, T);
        int penSum = N / P;
        int penSum2 = N % P;
        System.out.println(sum);
        System.out.println(penSum + " " + penSum2);
    }
    
    public static int count(int n, int man) {
        return (n % man == 0) ? n / man : (n / man) + 1;
    }
}