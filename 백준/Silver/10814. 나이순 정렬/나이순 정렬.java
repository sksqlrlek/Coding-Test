import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new Member(Integer.parseInt(input[0]), input[1]));
        }

        list.sort(Comparator.comparingInt(p -> p.age));

        for(Member m : list) {
            System.out.println(m.age + " " + m.name);
        }
    }

    public static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}