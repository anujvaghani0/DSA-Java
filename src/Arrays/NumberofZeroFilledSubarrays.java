package Arrays;

public class NumberofZeroFilledSubarrays {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 2, 0, 0};
        System.out.println(zeroFilledSubarray(nums));
    }

    public static long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                j = i + 1;
            } else {
                ans += i - j + 1;
            }
        }
        return  ans;
    }
}
