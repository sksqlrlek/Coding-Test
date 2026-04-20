import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : number.toCharArray()) {
            while(!st.isEmpty() && k > 0 && st.peek() < c) {
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k > 0) {
            st.pop();
            k--;
        }
        
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}