package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateAllParenthesis(ans, sb, n, n);
        return ans;
    }

    private static void generateAllParenthesis(List<String> ans, StringBuilder sb, int n1, int n2) {
        if (n1 > n2) {
            return;
        }

        if (n1 == 0 && n2 == 0) {
            StringBuilder s = new StringBuilder(sb);
            ans.add(s.toString());
            return;
        }

        if (n1 > 0) {
            sb.append('(');
            generateAllParenthesis(ans, sb, n1 - 1, n2);
            sb.deleteCharAt(sb.length() - 1);
        }


        if (n2 > 0) {
            sb.append(')');
            generateAllParenthesis(ans, sb, n1, n2 - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
