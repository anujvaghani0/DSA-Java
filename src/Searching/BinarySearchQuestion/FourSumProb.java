package Searching.BinarySearchQuestion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumProb {
    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println(fourSum(nums, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long target2 = (long) target - (long) nums[i] - (long) nums[j];
                int front = j + 1;
                int back = n - 1;
                while (front < back) {
                    int twoSum = nums[front] + nums[back];
                    if (twoSum < target2) {
                        front++;
                    } else if (twoSum > target2) {
                        back--;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[front]);
                        temp.add(nums[back]);
                        ans.add(temp);

                        //   processing the duplicate number of 3rd
                        while (front < back && nums[front] == temp.get(2)) {
                            front++;
                        }
                        // processing the duplicate number of 4th
                        while (front < back && nums[back] == temp.get(3)) {
                            back--;
                        }
                    }
                }

                //processing the duplicate number of 2nd
                while (j + 1 < n && nums[j + 1] == nums[j]) {
                    j++;
                }
            }
            //   processing the duplicate number of 1st
            while (i + 1 < n && nums[i + 1] == nums[i]) {
                i++;
            }
        }
        return ans;
    }
}
