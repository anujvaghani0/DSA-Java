package Arrays;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0;
        int negativeIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return  ans;
    }


//    public static int[] rearrangeArray(int[] nums) {
//        int[] ans = new int[nums.length];
//        ArrayList<Integer> positive = new ArrayList<>();
//        ArrayList<Integer> Negative = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                Negative.add(nums[i]);
//            } else {
//                positive.add(nums[i]);
//            }
//        }
//
//        for (int i = 0; i < nums.length / 2; i++) {
//            ans[2 * i] = positive.get(i);
//            ans[2 * i + 1] = Negative.get(i);
//        }
//        return  ans;
//    }
}
