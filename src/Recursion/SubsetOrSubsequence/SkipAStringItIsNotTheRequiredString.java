package Recursion.SubsetOrSubsequence;

public class SkipAStringItIsNotTheRequiredString {
    public static void main(String[] args) {
        String up = "rohitsharmaro";
        System.out.println(skip(up));
    }

    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("ro") && !up.startsWith("rohit")) {
            return skip(up.substring(2));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
