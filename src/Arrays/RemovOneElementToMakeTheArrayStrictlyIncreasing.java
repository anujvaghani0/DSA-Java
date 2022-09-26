package Arrays;

public class RemovOneElementToMakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {
        boolean removed = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (removed) {
                    return false;
                }
                removed = true;
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}