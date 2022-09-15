package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] ans = {7, 5, 9, 7, 5, 8, 10, 4, 3, 3, 2, 5, 9, 10};
        System.out.println(Arrays.toString(shuffle(ans, 7)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int k = 0;
        int[] ans = new int[nums.length];
        while (i < n || j < nums.length) {
            if (i < n) {
                ans[k] = nums[i];
                k++;
            }
            if (j < nums.length) {
                ans[k] = nums[j];
                k++;
            }
            i++;
            j++;
        }
        return ans;
    }
}
