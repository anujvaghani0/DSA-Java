package Math;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int element = 0;
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10) {
                digit += count(nums[i]);
            } else {
                digit += nums[i];
            }
            element += nums[i];
        }
        return Math.abs(element - digit);
    }

    private static int count(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }
}