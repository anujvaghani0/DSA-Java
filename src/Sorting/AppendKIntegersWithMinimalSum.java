package Sorting;

// Question link -> https://leetcode.com/problems/append-k-integers-with-minimal-sum/

import java.util.Arrays;


public class AppendKIntegersWithMinimalSum {
    public static void main(String[] args) {
        int[] nums = {1,4,25,10,25};
        System.out.println(minimalKSum(nums, 2));
    }


    public static long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long runningSum = 0;
        int previous = -1;
        for (int i = 0; i < nums.length; i++) {
            if (previous == nums[i]) {
                continue;
            }
            if (nums[i] <= k) {
                runningSum += nums[i];
                k++;
            }
            previous = nums[i];
        }

        long result = (long) k * (k + 1) / 2 - runningSum;
        return result;
    }


//    These solutions give me TLE Errors
//    public static long minimalKSum(int[] nums, int k) {
//        int[] arr = IntStream.of(nums).distinct().toArray();
//        Arrays.sort(arr);
//        int j = 0;
//        long i = 1;
//        long ans = 0;
//        while (k > 0) {
//            while (j<arr.length && arr[j] == i ) {
//                j++;
//                i++;
//            }
//            ans += i;
//            k--;
//            i++;
//        }
//        return ans;
//    }
}
