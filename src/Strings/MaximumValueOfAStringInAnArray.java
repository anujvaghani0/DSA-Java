package Strings;

// Question link -> https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/

public class MaximumValueOfAStringInAnArray {
    public static void main(String[] args) {
        String[] str = {"5232", "yv","az", "22", "c", "yawgs", "928", "4003", "2"};
        System.out.println(maximumValue(str));
    }

    public static int maximumValue(String[] str) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (solve(str[i])) {
                max = Math.max(max, Integer.parseInt(str[i]));
            } else {
                max = Math.max(max, str[i].length());
            }
        }
        return max;
    }

    private static boolean solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                return false;
            }
        }
        return true;
    }
}
