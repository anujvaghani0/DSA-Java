package Strings;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        int previousLength = 0;
        int currentLength = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                previousLength = currentLength;
                currentLength = 1;
            }
            if (previousLength >= currentLength) {
                count++;
            }
        }
        return count;
    }
}
