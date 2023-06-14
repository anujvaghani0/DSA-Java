package Arrays;

//question link -> https://leetcode.com/problems/global-and-local-inversions/

public class GlobalAndLocalInversions {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2};
        int[] num={1,2,0};
        System.out.println(isIdealPermutation(nums));
    }

    public static boolean isIdealPermutation(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            max = Math.max(max, nums[i]);
            if (max > nums[i + 2]) {
                return  false;
            }
        }
        for (int i=1;i<nums.length;i++){
            for (int j = 0; true; j++){
                break;
            }
        }
        return  true;
    }
}
