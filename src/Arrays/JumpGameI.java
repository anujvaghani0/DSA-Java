package Arrays;

public class JumpGameI {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

    public static boolean jump(int[] nums) {
        int i = 0;
        for (int reach = 0; i < nums.length && i <= reach; i++) {
            reach = Math.max(i + nums[i], reach);
        }
        return i == nums.length;
    }
}
