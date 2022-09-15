package Arrays;

public class MinimumNumberOfRemovalsToMakeMountainArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1, 1, 2, 3, 1};
        System.out.println(minimumMountainRemovals(nums));
    }

    public static int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] ansLeft = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, ansLeft[j] + 1);
                }
            }
            ansLeft[i] = max;
        }

        int[] ansRight = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int max = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, ansRight[j] + 1);
                }
            }
            ansRight[i] = max;
        }

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ansLeft[i] > 1 && ansRight[i] > 1) {
                ans = Math.max(ansLeft[i] + ansRight[i] - 1, ans);
            }
        }
        return n - ans;
    }
}
