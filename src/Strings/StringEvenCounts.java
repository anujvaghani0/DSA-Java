package Strings;

public class StringEvenCounts {
    public static void main(String[] args) {
        System.out.println(sum("aaaabffghtuuiillphhhyy"));
    }

    public static int sum(String s) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == s.charAt(i)) {
                count++;
            } else {
                if (count % 2 == 0) {
                    sum += count;
                }
                count = 1;
            }
        }
        return count % 2 == 0 ? count + sum : sum;
    }
}