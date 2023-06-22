package DynamicProgramming;  

public class UncrossedLines {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        System.out.println(maxUncrossedLines(nums1, nums2));
    }

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m < n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            m = nums1.length;
            n = nums2.length;
        }

        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            int previous = 0;
            for (int j = 1; j <= n; j++) {
                int current = dp[j];
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[j] = previous + 1;
                } else {
                    dp[j] = Math.max(dp[j - 1], current);
                }
                previous = current;
            }
        }
        return dp[n];
    }
}
