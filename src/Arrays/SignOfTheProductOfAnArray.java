package Arrays;

//question link -> https://leetcode.com/problems/sign-of-the-product-of-an-array/

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 0, 2, 1};
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else {
                negative++;
            }
        }
        if (negative % 2 == 1) {
            return -1;
        }
        return 1;
    }
}
