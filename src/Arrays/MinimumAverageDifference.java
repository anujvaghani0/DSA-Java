package Arrays;

// Question link -> https://leetcode.com/problems/minimum-average-difference/

public class MinimumAverageDifference {
    public static void main(String[] args) {
        int[] numbs = {4, 2, 0};
        System.out.println(minimumAverageDifference(numbs));
    }

    public static int minimumAverageDifference(int[] nums) {
        long min = Integer.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftIndex = 0;
        int rightIndex = -1;
        long prefixSum = 0;

        while (leftIndex < nums.length) {
            prefixSum += nums[leftIndex];
            long leftAverage = prefixSum / (leftIndex + 1);
            long sumRight = sum - prefixSum;
            if (sumRight != 0) {
                sumRight /= nums.length - leftIndex - 1;
            }

            long res = Math.abs(leftAverage - sumRight);
            if (res < min) {
                min = res;
                rightIndex = leftIndex;
            }
            leftIndex++;
        }
        return rightIndex;
    }
}
