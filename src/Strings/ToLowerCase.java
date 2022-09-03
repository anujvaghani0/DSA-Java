package Strings;

public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans.append((char) (s.charAt(i) + ('a' - 'A')));
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
