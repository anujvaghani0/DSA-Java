package Math;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(886996));
    }

    public static int alternateDigitSum(int n) {
        String temp = String.valueOf(n);
        int ans = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (i % 2 == 0) {
                ans += Integer.valueOf(temp.charAt(i)) - '0';
            } else {
                ans -= Integer.valueOf(temp.charAt(i)) - '0';
            }
        }
        return ans;
    }
}
