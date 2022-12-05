package Strings;

public class palindromeString {
    public static void main(String[] args) {
        String name = "abcdcba";
        System.out.println(palindrome(name));
    }

    public static int palindrome(String name) {
        StringBuilder ans = new StringBuilder();
        for (int i = name.length(); i > 0; i--) {
            ans.append(name.charAt(i - 1));
        }
        if (ans.toString().equals(name)) {
            return 1;
        }
        return 0;
    }
}
