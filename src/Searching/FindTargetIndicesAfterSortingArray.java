package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 3};
        List<Integer> ans = targetIndices(arr, 2);
        System.out.println(ans);
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        int lessthan = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
            if (nums[i] < target) {
                lessthan++;
            }
        }
        for (int i = 0; i < count; i++) {
            ans.add(lessthan);
            lessthan++;
        }
        return ans;
    }
}

//2nd solutions
//        Arrays.sort(nums);
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                ans.add(i);
//            }
//        }
//        return ans;
