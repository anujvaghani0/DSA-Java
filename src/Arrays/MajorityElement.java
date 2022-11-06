package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                max = nums[i];
            }
            if (max == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return max;
    }
}
