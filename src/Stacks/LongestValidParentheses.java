package Stacks;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }
    
    public static int longestValidParentheses(String s) {
        int ans = 0;
        int currentLength = 0;
        int lastCloseLength = -1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (st.isEmpty()) {
                    lastCloseLength = i;
                } else {
                    st.pop();
                    if (st.isEmpty()) {
                        currentLength = i - lastCloseLength;
                    } else {
                        currentLength = i - st.peek();
                    }
                    ans = Math.max(currentLength, ans);
                }
            }
        }
        return ans;
    }
}
