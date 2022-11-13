package Arrays;

import java.util.Arrays;

public class demotest {
    public static void main(String[] args) {
        int[] num = {-1, -100, 3, 99};
        rotated(num, 2);
    }

    public static void rotated(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int j = 0;
//        this is first attempted bt i know to complexity matter that's why only single attempted
//        for (int i = nums.length - k; i < nums.length; i++) {
//            ans[j] = nums[i];
//            j++;
//        }
//        for (int i = 0; i < nums.length - k; i++) {
//            ans[j] = nums[i];
//            j++;
//        }

//        only one for loop
        for (int i = 0; i < nums.length; i++) {
            if (k != 0) {
                ans[i] = nums[nums.length - k];
                k--;
                continue;
            }
            ans[i] = nums[j];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}