package Arrays;

// Question link -> https://practice.geeksforgeeks.org/problems/magic-triplets4003/1

public class MagicTriplets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(countTriplets(nums));
    }

    public static int countTriplets(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int small = 0;
            int large = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    small++;
                }
            }
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[k] > nums[i]) {
                    large++;
                }
            }
            count += small * large;
        }
        return count;
    }
}
