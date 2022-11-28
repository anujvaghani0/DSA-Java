package Arrays;

// Question link -> https://leetcode.com/problems/find-pivot-index/

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            rightsum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            rightsum -= nums[i];
            if (rightsum == leftsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
