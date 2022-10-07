package Arrays;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, -1, 100000};
        System.out.println(findClosestNumber(nums));
    }

    public static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > Math.abs(nums[i])) {
                min = Math.abs(nums[i]);
                index = nums[i];
            } else if (min == Math.abs(nums[i]) && index < nums[i]) {
                index = nums[i];
            }
        }
        return index;
    }
}