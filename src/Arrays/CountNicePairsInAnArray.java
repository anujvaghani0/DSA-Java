package Arrays;

public class CountNicePairsInAnArray {
    public static void main(String[] args) {
        int[] nums = {42, 11, 1, 97};
        System.out.println(countNicePairs(nums));
    }

    public static int countNicePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (reverse(nums[j]) + nums[i] == reverse(nums[i]) + nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    public static int reverse(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        return sum;
    }
}
