package Arrays;

public class MonotonicArray {
    public static void main(String[] args) {
    int[] nums={1,2,3,3,2};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean increasing = (nums[nums.length - 1] - nums[0]) > 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i] && (nums[i + 1] - nums[i] > 0) != increasing) {
                return false;
            }
        }
        return true;
    }
}
