package Arrays;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
    int[] nums={1,2,3};
    int[] ans=getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans= Arrays.copyOfRange(nums,0,(nums.length)*2);
        for (int i=0;i<nums.length;i++){
            ans[nums.length+i]=nums[i];
        }
        return ans;
    }
}
