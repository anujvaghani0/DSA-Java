package Arrays;

public class CkIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
