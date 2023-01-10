package Arrays;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static void main(String[] args) {

    }

    public static int maximumCount(int[] nums) {
        int n = 0;
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else if (nums[i] < 0) {
                n++;
            } else {
                p++;
            }
        }
        return Math.max(n, p);
    }
}
