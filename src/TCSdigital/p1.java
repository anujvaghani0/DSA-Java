package TCSdigital;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rotations(nums, 2)));
    }

    public static int[] rotations(int[] nums, int k) {
        int index = 0;
        int[] ans = new int[nums.length];
        for (int i = nums.length - k; i < nums.length; i++) {
            ans[index++] = nums[i];
        }
        for (int i = 0; i <= k; i++) {
            ans[index++] = nums[i];
        }
        return ans;
    }
}
