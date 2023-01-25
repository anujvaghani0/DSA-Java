package Strings;

public class Typeit {
    public static void main(String[] args) {
        System.out.println(minOperation("abcabca"));
    }


    public static int minOperation(String s) {
        int ans = s.length();
        for (int i = 0; i < s.length() / 2; i++) {
            boolean isValid = true;
            for (int j = 0; j <= i && isValid; j++) {
                if (s.charAt(j) != s.charAt(j + i + 1)) {
                    isValid = false;
                }
            }
            if (isValid) {
                ans = s.length() - i;
            }
        }
        return ans;
    }
}
