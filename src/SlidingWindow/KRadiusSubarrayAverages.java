package SlidingWindow;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        System.out.println(Arrays.toString(getAverages(nums, 3)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        int K = 2 * k + 1;
        long sum = 0L;
        Arrays.fill(ans, -1);
        if (K > n) {
            return ans;
        }

        for (int i = 0; i < K; i++) {
            sum += nums[i];
        }
        ans[k] = (int) (sum / K);
        for (int i = k + 1; i < n - k; i++) {
            sum += nums[i + k] - nums[i - k - 1];
            ans[i] = (int) (sum / K);
        }
        return ans;
    }
}
