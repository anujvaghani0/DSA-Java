package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }


    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

//            if the opening bracket then push into the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
//                if a closing bracket then we compare with the top of the stack
                if (!st.empty()) {
                    char top = st.peek();
                    if ((ch == ')' && top == '(') ||
                            (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[')) {
//                        if the element same then pop
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if (st.empty()){
            return true;
        }
        return false;
    }
}