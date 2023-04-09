package Stacks;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {

    }

    public static int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
