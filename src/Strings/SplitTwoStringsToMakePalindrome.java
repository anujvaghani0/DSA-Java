package Strings;

public class SplitTwoStringsToMakePalindrome {
    public static void main(String[] args) {
        String a = "jizalu";
        String b = "ulacfd";
        System.out.println(checkPalindromeFormation(a, b));
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private static boolean check(String a, String b) {
        int i = 0;
        int j = b.length() - 1;
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        return i >= j;
    }
//    public static boolean palindrome(String a) {
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < a.length(); i++) {
//            ans.append(a.charAt(i));
//        }
//        return ans.toString().equals(a);
//    }
}
