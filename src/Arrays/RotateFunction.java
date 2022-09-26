package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateFunction {
    public static void main(String[] args) {
        int[] nums = {4,3,2,6};
        System.out.println(maxRotateFunction(nums));
    }

    public static int maxRotateFunction(int[] nums) {
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += i * nums[i];
            ans += nums[i];
        }
        int max = temp;
        for (int i = nums.length - 1; i >= 1; i--) {
            temp = temp + ans - (nums.length * nums[i]);
            max = Math.max(temp, max);
        }
        return max;
    }
}
