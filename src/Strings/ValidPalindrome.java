package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= ' ' && s.charAt(i) <= '/') {
                continue;
            } else if (s.charAt(i) >= ':' && s.charAt(i) <= '@') {
                continue;
            } else if (s.charAt(i) >= '[' && s.charAt(i) <= '`') {
                continue;
            } else if (s.charAt(i) >= '{' && s.charAt(i) <= '~') {
                continue;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans.append((char) (s.charAt(i) + ('a' - 'A')));
            } else {
                ans.append(s.charAt(i));
            }
        }
        StringBuilder ans1 = new StringBuilder();
        for (int i = ans.length(); i > 0; i--) {
            ans1.append(ans.charAt(i - 1));
        }
        if (ans1.toString().equals(ans.toString())) {
            return true;
        }
        return false;
    }
}
