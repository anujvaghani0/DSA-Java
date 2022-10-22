package Strings;

//question link -> https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/

public class CheckIfAllAsAppearsBeforeAllBs {
    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
    }

    public static boolean checkString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'b') {
                if (s.charAt(i + 1) == 'a') {
                    return false;
                }
            }
        }
        return true;
    }
}
