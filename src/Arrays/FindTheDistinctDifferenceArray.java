package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheDistinctDifferenceArray {
    public static void main(String[] args) {
    int[] nums={3,2,3,4,2};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer, Integer> suffix = new HashMap<>();
        for (int x : nums) {
            suffix.put(x, suffix.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer x = nums[i];
            prefix.put(x, prefix.getOrDefault(x, 0) + 1);
            suffix.put(x, suffix.get(x) - 1);
            if (suffix.get(x) == 0) {
                suffix.remove(x);
            }
            ans[i] = prefix.size() - suffix.size();
        }
        return  ans;
    }
}
