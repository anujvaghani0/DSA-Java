package Arrays;

import java.util.Arrays;

public class FindTheScoreOfAllPrefixesOfAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 5, 10};
        System.out.println(Arrays.toString(findPrefixScore(nums)));
    }

    public static long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        long max = nums[0];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = max < nums[i] ? nums[i] : max;
            sum += nums[i] + max;
            ans[i] = sum;
        }
        return ans;
    }
}
