import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> set = new HashSet<>(); 
        for(int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        List<String> lists = new ArrayList<>(set);
        
        Collections.sort(lists, (a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        for(String list : lists) {
            System.out.println(list);
        }
        
    }
}