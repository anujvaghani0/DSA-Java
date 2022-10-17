package Arrays;

//question link -> https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/

public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {
    public static void main(String[] args) {
        String[] nums = {"777", "7", "77", "77"};
        System.out.println(numOfPairs(nums, "7777"));
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target) && i != j) {
                    count++;
                }
            }
        }
        return count;
    }
}
