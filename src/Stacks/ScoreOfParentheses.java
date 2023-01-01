package Stacks;

import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("()((()))"));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (int i : s.toCharArray()) {
            if (i == '(') {
                st.push(score);
                score = 0;
            } else {
                score = st.pop() + Math.max((score * 2), 1);
            }
        }
        return score;
    }
}
