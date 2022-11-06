package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] numbs = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(numbs, 6));
    }

    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = end + (start - end) / 2;
            if (nums[mid] == target || nums[start] == target || nums[end] == target) {
                return true;
            }
            if (target > nums[mid] && target < nums[end]) {
                start = mid + 1;
                continue;
            } else if (target < nums[mid] && target > nums[start]) {
                end = mid - 1;
                continue;
            }
            start++;
            end--;
        }
        return false;
    }
}
