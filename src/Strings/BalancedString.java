package Strings;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(BalancedString(21));
    }

    public static String BalancedString(int N) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String ans = "";
        int dig = N;
        while (N > 26) {
            ans += alphabet;
            N -= 26;
        }
        int start = 0, end = 0;
        int sum = 0;
        while (dig > 0) {
            sum += dig % 10;
            dig /= 10;
        }

        if ((N & 1) == 1) {
            if ((sum & 1) == 1) {
                start = (N - 1) / 2;
                end = (N + 1) / 2;
            } else {
                start = (N + 1) / 2;
                end = (N - 1) / 2;
            }
        } else {
            start = N / 2;
            end = N / 2;
        }
        ans += alphabet.substring(0, (start));
        ans += alphabet.substring((26 - end), end);

        return ans;
    }
}
