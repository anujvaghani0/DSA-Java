package DynamicProgramming;

public class RestoreTheArray {
    public static void main(String[] args) {
        System.out.println(numberOfArrays("1000",10000));
    }

    static int mod = (int) (10e9 + 7);

    public static int numberOfArrays(String s, int k) {
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            long num = 0, sum = 0;
            for (int j = i; j < s.length(); j++) {
                num = num * 10 + (s.charAt(j) - '0');
                if (num == 0 || num > k) {
                    break;
                }
                sum += dp[j + 1];
            }
            dp[i] = (int) (sum % mod);
        }
        return dp[0];
    }
}
