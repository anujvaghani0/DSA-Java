package Strings;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6333177739"));
    }

    public static String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
                if (num.substring(i - 2, i + 1).compareTo(ans) > 0) {
                    ans = num.substring(i - 2, i + 1);
                }
            }
        }
        return ans;
    }
}
