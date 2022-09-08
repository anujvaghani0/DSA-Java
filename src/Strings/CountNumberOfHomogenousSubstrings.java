package Strings;

public class CountNumberOfHomogenousSubstrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogenous(s));
    }

    public static int countHomogenous(String s) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {
                count = 1;
            }
            ans = (ans + count) % 1000000007;
        }
        return ans;
    }
}