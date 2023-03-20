package Strings;

public class IsSubsequence {
    public static void main(String[] args) {

    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        if (s.length() < 1) {
            return true;
        }
        while (i < s.length()) {
            if (ss[i] == tt[j]) {
                j++;
            }
            i++;
        }
        if (j == s.length()) {
            return true;
        }
        return false;
    }
}
