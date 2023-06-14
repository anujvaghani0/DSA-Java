package Arrays;

public class MinimizeMaximumOfArray {
    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 6};
        System.out.println(minimizeArrayValue(nums));
    }

    public static int minimizeArrayValue(int[] nums) {
        long sum = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, (sum + i) / (i + 1));
        }
        return  (int) ans;
    }
}
