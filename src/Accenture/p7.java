package Accenture;

import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
        int[] nums = {9, 8, 3, -7, 3, 9};
        System.out.println(count(nums));
    }

    public static int count(int[] nums) {
        Arrays.sort(nums);
        return nums[0] * nums[1];
    }
}
