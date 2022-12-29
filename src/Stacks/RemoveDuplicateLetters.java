package Stacks;

// Question link -> https://leetcode.com/problems/remove-duplicate-letters/

import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    public static String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] count = new int[26];
        char[] arr = s.toCharArray();
        for (char c : arr) {
            count[c - 'a']++;
        }
        boolean[] visited = new boolean[26];
        for (char c : arr) {
            count[c - 'a']--;
            if (visited[c - 'a']) {
                continue;
            }
            while (!st.empty() && st.peek() > c && count[st.peek() - 'a'] > 0) {
                visited[st.peek() - 'a'] = false;
                st.pop();
            }
            st.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : st) {
            ans.append(c);
        }
        return ans.toString();
    }
}

