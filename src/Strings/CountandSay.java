package Strings;

//question link -> https://leetcode.com/problems/count-and-say/

public class CountandSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        StringBuilder current = new StringBuilder("1");
        StringBuilder Previous;
        int count;
        char say;
        for (int i = 1; i < n; i++) {
            Previous = current;
            current = new StringBuilder();
            count = 1;
            say = Previous.charAt(0);

            for (int j = 1; j < Previous.length(); j++) {
                if (Previous.charAt(j) != say) {
                    current.append(count).append(say);
                    count = 1;
                    say = Previous.charAt(j);
                } else {
                    count++;
                }
            }
            current.append(count).append(say);
        }
        return current.toString();
    }
}
