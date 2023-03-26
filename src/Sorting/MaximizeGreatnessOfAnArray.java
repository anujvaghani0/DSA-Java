package Sorting;

import java.util.Arrays;

public class MaximizeGreatnessOfAnArray {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 2, 1, 3, 1};
        System.out.println(maximizeGreatness(num));
    }

    public static int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0, j = 1; j < nums.length; j++) {
            if (nums[i] < nums[j]) {
                ans++;
                i++;
            }
        }
        return ans;
    }
}
