package Array;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    public static boolean jump(int[] nums) {
//        int jumps = 0;
//        int curMax = 0;
//        int curReach = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (i + nums[i] > curMax) {
//                curMax = i + nums[i];
//            }
//            if (i == curReach) {
//                curReach = curMax;
//                jumps++;
//            }
////            if (nums[nums.length-1]==curReach){
////                return true;
////            }
//        }
//   return jumps;
        int i=0;
        for (int reach = 0; i < nums.length && i <= reach; i++) {
            reach = Math.max(i + nums[i], reach);
        }
        return i == nums.length;
    }
}
