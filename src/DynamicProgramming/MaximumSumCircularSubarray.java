package DynamicProgramming;  

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int sumTrack = 0;
        int max1 = kadane(nums);

        for (int i = 0; i < nums.length; i++) {
            sumTrack += nums[i];
            nums[i] = -nums[i];
        }

        int min = kadane(nums);

        int max2 = sumTrack + min;
        if (max2 == 0) {
            return max1;
        }

        return Math.max(max1, max2);
    }

    private static int kadane(int[] nums) {
        int sum = 0;
        int maxi = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = Math.max(sum, maxi);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}
