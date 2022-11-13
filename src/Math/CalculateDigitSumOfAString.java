package Math;

//question link -> https://leetcode.com/problems/calculate-digit-sum-of-a-string/

public class CalculateDigitSumOfAString {
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            s = stringsum(s, k);
        }
        return s;
    }

    private static String stringsum(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int l = 0;
            int sum = 0;
            while (i < s.length() && k > l) {
                sum += s.charAt(i) - '0';
                i++;
                l++;
            }
            ans.append(String.valueOf(sum));
        }
        return ans.toString();
    }
}
