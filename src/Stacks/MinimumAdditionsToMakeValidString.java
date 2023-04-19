package Stacks;

import java.util.Stack;

public class MinimumAdditionsToMakeValidString {
    public static void main(String[] args) {
        System.out.println(addMinimum("aaa"));
    }

    public static int addMinimum(String word) {
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            if (st.isEmpty()) {
                st.add((int) (word.charAt(i)));
            } else if (st.peek() == (int) (word.charAt(i)) - 1 || st.peek() == (int) (word.charAt(i)) - 2) {
                st.add((int) (word.charAt(i)));
            } else {
                count = count + 3 - st.size();
                st.clear();
                st.add((int) (word.charAt(i)));
            }
        }
        count = count + 3 - st.size();
        return count;
    }
}
