package Arrays;

// Question link -> https://leetcode.com/problems/number-of-ways-to-split-array/

public class NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3};
        System.out.println(waysToSplitArray(nums));
    }

    public static int waysToSplitArray(int[] nums) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int count = 0;
        long temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            temp += nums[i];
            if (temp >= sum - temp) {
                count++;
            }
        }
        return  count;
    }
}
