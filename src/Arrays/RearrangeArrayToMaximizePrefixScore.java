package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class RearrangeArrayToMaximizePrefixScore {
    public static void main(String[] args) {
        int[] nums = {2, -1, 0, 1, -3, 3, -3};
        System.out.println(maxScore(nums));
    }

    public static int maxScore(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list);

        long sum = 0;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            if (sum > 0) {
                count++;
            }
        }
        return  count;
    }
}
