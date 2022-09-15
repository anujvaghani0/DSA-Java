package Arrays;

public class MinMaxGame {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(minMaxGame(arr));
    }

    public static int minMaxGame(int[] nums) {
        while (nums.length > 1) {
            int n = nums.length;
            int[] newArrays = new int[n / 2];
            for (int i = 0; i < newArrays.length; i++) {
                newArrays[i] = (i % 2 == 0) ? Math.min(nums[2 * i], nums[2 * i + 1]) : Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            nums = newArrays;
        }
        return nums[0];
    }
}
