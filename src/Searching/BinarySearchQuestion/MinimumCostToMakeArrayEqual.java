package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimum-cost-to-make-array-equal/

public class MinimumCostToMakeArrayEqual {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] cost = {1,2,3,4,5};
        System.out.println(minCost(nums, cost));
    }

    public static long minCost(int[] nums, int[] cost) {
        long min = Integer.MAX_VALUE;
        long max = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        ans = result(nums, cost, max);
        long start = min;
        long end = max;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long part1 = result(nums, cost, mid);
            long part2 = result(nums, cost, mid + 1);
            if (part1 < part2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            ans = Math.min(ans, Math.min(part1, part2));
        }
        return ans;
    }

    private static long result(int[] nums, int[] cost, long max) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += (Math.abs(nums[i] - max) * cost[i]);
        }
        return ans;
    }
}