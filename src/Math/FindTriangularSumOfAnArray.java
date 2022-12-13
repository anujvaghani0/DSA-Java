package Math;

// Question link -> https://leetcode.com/problems/find-triangular-sum-of-an-array/

public class FindTriangularSumOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(nums));
    }

    public static int triangularSum(int[] nums) {
        int[] previous = nums;
        for (int i = nums.length - 1; i > 0; i--) {
            int[] list = new int[i];
            for (int j = 0; j < i; j++) {
                list[j] = (previous[j] + previous[j + 1]) % 10;
            }
            previous = list;
        }
        return previous[0];
    }
}