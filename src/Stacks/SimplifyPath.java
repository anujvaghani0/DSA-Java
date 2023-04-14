package Stacks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        String[] temp = path.split("/");
        for (String dir : temp) {
            if (dir.equals("..") && !st.isEmpty()) {
                st.pop();
            } else if (!skip.contains(dir)) {
                st.push(dir);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop()).insert(0, "/");
        }
        return ans.isEmpty() ? "/" : ans.toString();
    }
}
