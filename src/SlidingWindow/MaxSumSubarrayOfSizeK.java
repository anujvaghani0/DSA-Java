package SlidingWindow;

// Question link -> https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/0

import java.util.ArrayList;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
    ArrayList<Integer> nums=new ArrayList<>();
    nums.add(400);
    nums.add(300);
    nums.add(200);
    nums.add(100);
        System.out.println(maximumSumSubarray(2,nums, nums.size()));
    }

    public static long maximumSumSubarray(int k, ArrayList<Integer> nums, int N){
        long sum = 0;
        int j = 0;
        int i = 0;
        long max = Integer.MIN_VALUE;
        while (j < nums.size()) {
            sum += nums.get(j);
            if (j - i + 1 < k) {
                j++;
            } else {
                max = Math.max(sum, max);
                sum -= nums.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
}
