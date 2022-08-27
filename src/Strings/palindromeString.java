package Strings;

public class palindromeString {
    public static void main(String[] args) {
        String name = "abcdcba";
        System.out.println(palindrome(name));
    }

    public static boolean palindrome(String name) {
        String temp = name;
        StringBuilder ans = new StringBuilder();
        for (int i = temp.length(); i > 0; i--) {
            ans.append(temp.charAt(i - 1));
        }
        if (ans.toString().equals(temp)) {
            return true;
        }
        return false;
    }
}
