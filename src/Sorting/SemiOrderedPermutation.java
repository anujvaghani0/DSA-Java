package Sorting;

public class SemiOrderedPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 5};
        System.out.println(semiOrderedPermutation(nums));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                a = i;
            }

            if (nums[i] == n) {
                b = i;
            }
        }
        return a + (n - 1 - b) - (a > b ? 1 : 0);
    }
}
