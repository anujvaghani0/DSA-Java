package sorting;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
//        Input: g = [1,2], s = [1,2,3]
        int[] g = {1,2};
        int[] s = {1,2,3};

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        for (int i = 0; i < g.length && i < s.length; i++) {
            if (s[i] == g[i]) {
                ans++;
            }
        }
        return ans;
    }
}
