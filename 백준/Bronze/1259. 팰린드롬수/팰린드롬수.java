import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String n = sc.nextInt() + "";
            if(n.equals("0")) break;
            String sb = new StringBuilder(n + "").reverse().toString();
            if(n.equals(sb)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
    }
}