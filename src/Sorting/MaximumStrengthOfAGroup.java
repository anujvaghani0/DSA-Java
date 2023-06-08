package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaximumStrengthOfAGroup {
    public static void main(String[] args) {
        int[] ans = {0, 0, -5};
        System.out.println(maxStrength(ans));
    }

    public static long maxStrength(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            if ((nums[0] == 0 && nums[1] < 0) || (nums[0] < 0 && nums[1] == 0)) {
                return 0;
            }
        }
        long ans = 1;
        int count = 0;
        int zeros = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                temp.add((nums[i]));
                count++;
            } else if (nums[i] == 0) {
                zeros++;
            }
        }

        Collections.sort(temp);

        int i = 0;
        int j = 0;
        while (i < nums.length || j < temp.size()) {
            if (i < nums.length && nums[i] > 0) {
                ans *= (long) nums[i];
            } else if (j < temp.size()) {
                ans *= (-temp.get(j++));
            }
            i++;
        }
        if (zeros == 1 && count + zeros == nums.length) {
            return zeros;
        }
        return count % 2 == 0 ? ans : (-(ans / temp.get(temp.size() - 1)));
    }
}
