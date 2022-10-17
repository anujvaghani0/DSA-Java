package Strings;

//question link -> https://leetcode.com/problems/move-pieces-to-obtain-a-string/

public class MovePiecesToObtainAString {
    public static void main(String[] args) {
        System.out.println(canChange("_L__R__R_", "L______RR"));
    }

    public static boolean canChange(String start, String target) {
        int n = target.length();
        if (!(start.replaceAll("_", "")).equals(target.replaceAll("_", ""))) {
            return false;
        }
        for (int i = 0, j = 0; i < n && j < n; i++, j++) {
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            while (j < n && target.charAt(j) == '_') {
                j++;
            }
            if (i < n && j < n && ((start.charAt(i) == 'L' && i < j) || (target.charAt(j) == 'R' && i > j))) {
                return false;
            }
        }
        return true;
    }
}
