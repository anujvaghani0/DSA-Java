package Arrays;

// Question link -> https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1

public class ArrayPairSumDivisibilityProblem {
    public static void main(String[] args) {
        int[] nums = {9, 5, 7, 3};
        System.out.println(canPair(nums, 6));
    }

    public static boolean canPair(int[] nums, int k) {
        if (nums.length % 2 == 1) {
            return  false;
        }

        int[] temp = new int[100001];
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i] % k;
            if (temp[(k - num1) % k] != 0) {
                temp[(k - num1) % k]--;
            } else {
                temp[num1]++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0) {
                return  false;
            }
        }
        return  true;
    }
}
