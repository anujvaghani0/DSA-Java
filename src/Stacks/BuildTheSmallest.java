package Stacks;

// Question link -> https://leetcode.com/problems/remove-k-digits/

import java.util.Stack;

public class BuildTheSmallest {
    public static void main(String[] args) {
        System.out.println(buildLowestNumber("1432219",3));
    }

    public static String buildLowestNumber(String num, int k) {
        if (k == num.length()) {
            return "0";
        }

        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            char ch = num.charAt(i);
            while (!st.empty() && st.peek() > ch && k > 0) {
                st.pop();
                k--;
            }
            st.push(ch);
            i++;
        }
        while (k > 0) {
            st.pop();
            k--;
        }


        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        while (ans.charAt(0) == '0' && ans.length() > 1) {
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
}
