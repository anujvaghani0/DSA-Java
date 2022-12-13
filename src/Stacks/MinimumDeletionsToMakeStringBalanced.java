package Stacks;

// Question link -> https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

//Based on the algorithm

import java.util.Stack;

public class MinimumDeletionsToMakeStringBalanced {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("bbaaaaabb"));
    }

    public static int minimumDeletions(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!st.empty() && (st.peek() == 'b' && c == 'a')) {
                st.pop();
                count++;
            } else if (c == 'b') {
                st.push(c);
            }
        }
        return count;
    }
}
