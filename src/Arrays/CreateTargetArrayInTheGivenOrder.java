package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ind = index[i];
            if (ind < i) {
                for (int j = i; j > ind; j--) {
                    ans[j] = ans[j - 1];
                }
            }
            ans[ind] = nums[i];
        }
        return ans;
    }
}


// 2nd solution
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(index[i], nums[i]);
//        }
//        int[] target = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            target[i] = list.get(i);
//        }
//        return target;