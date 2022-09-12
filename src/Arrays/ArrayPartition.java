package Arrays;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] ans = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(ans));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            ans += Math.min(nums[i], nums[i + 1]);
        }
        return ans;
    }
}