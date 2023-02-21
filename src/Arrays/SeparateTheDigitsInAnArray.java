package Arrays;

import java.util.ArrayList;

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {

    }

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 9) {
                while (nums[i] != 0) {
                    int rem = nums[i] % 10;
                    list.add(rem);
                    nums[i] = nums[i] / 10;
                }
                list.add(nums[i]);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
