package DynamicProgramming;  

import java.util.Arrays;
import java.util.Map;

public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(findLongestChain(pairs));
    }

    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        int length = pairs.length;
        int[] dp = new int[length];
        int maxchain = 0;
        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1] && max < dp[j]) {
                    max = dp[j];
                }
                dp[i] = 1 + max;
                maxchain = Math.max(maxchain, dp[i]);
            }
        }
        return maxchain;
    }
}
