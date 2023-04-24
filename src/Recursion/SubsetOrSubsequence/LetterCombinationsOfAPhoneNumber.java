package Recursion.SubsetOrSubsequence;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        phonePed("", "1234");
    }

    public static void phonePed(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phonePed(p + ch, up.substring(1));
        }
    }
}
