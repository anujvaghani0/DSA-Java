package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbs, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                nums[0] = start + 1;
                nums[1] = end + 1;
                break;
            } else if (target < sum) {
                end--;
            } else {
                start++;
            }
        }
        return nums;
    }
}