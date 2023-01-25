package Stacks;

import java.util.Stack;

public class GeeksAndTheString {
    public static void main(String[] args) {
        System.out.println(removePair("aaabbaaccd"));
    }

    public static String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.empty() && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        if (st.size() == 0) {
            ans.append("-1");
            return ans.toString();
        }

        while (!st.empty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
