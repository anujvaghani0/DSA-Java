package Stacks;

// Question link -> https://leetcode.com/problems/evaluate-reverse-polish-notation/

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
    String[] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int temp = calculator(a, b, s.charAt(0));
                st.push(temp);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }

    private static int calculator(int a, int b, char oprtr) {
        if (oprtr == '+') {
            return a + b;
        } else if (oprtr == '-') {
            return a - b;
        } else if (oprtr == '*') {
            return a * b;
        } else {
            return a / b;
        }
    }
}
