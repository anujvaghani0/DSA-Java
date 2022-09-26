package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfUniqueElements {
    public static void main(String[] args) {
    int[] num={10,6,9,6,9,6,8,7};
        System.out.println(sumOfUnique(num));
    }

    public static int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        boolean check=false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=0;
                    check=true;
                }
            }
            if(check){
                nums[i]=0;
            }
                check=false;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        return ans;
    }
}
