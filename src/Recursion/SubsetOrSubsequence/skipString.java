package Recursion.SubsetOrSubsequence;

public class skipString {
    public static void main(String[] args) {
        String up = "rohitsharmarohit";
        System.out.println(skip(up));
    }

    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("rohit")) {
            return skip(up.substring(5));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
