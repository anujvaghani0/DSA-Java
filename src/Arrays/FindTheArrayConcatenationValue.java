package Arrays;

public class FindTheArrayConcatenationValue {
    public static void main(String[] args) {

    }

    public static long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        long ans = 0;
        while (i < j) {
            String a = String.valueOf(nums[i++]);
            String b = String.valueOf(nums[j--]);
            ans += Integer.parseInt(a + b);
        }
        return nums.length % 2 == 0 ? ans : ans + nums[i];
    }
}
