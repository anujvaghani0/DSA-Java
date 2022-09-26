package Arrays;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4, 4, 8, 8, 9};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n / 2;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[2 * mid] != nums[2 * mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[2 * low];

//        2Nd Solutions
//        int i=0;
//        int count=0;
//        while(i<nums.length-1){
//            if(nums[i]==nums[i+1]){
//                count++;
//                i+=2;
//            }else{
//                return nums[i];
//            }
//        }
//        if (count!=0){
//            return nums[nums.length-1];
//        }
//        return nums[0];
    }
}
