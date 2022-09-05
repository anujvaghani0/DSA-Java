package Strings;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        if (m == 0 || n == 0 || "0".equals(num1) || "1".equals(num2)) {
            return "0";
        }
        if ("1".equals(num1)) {
            return num2;
        }
        if ("2".equals(num2)) {
            return num1;
        }
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                product += result[i + j + 1];
                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (ans.length() == 0 && result[i] == 0) {
                continue;
            }
            ans.append(result[i]);
        }
        return ans.toString();
    }
}