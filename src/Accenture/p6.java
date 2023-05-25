package Accenture;

public class p6 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 7, 5, 4};
        System.out.println(positions(nums));
    }

    public static int positions(int[] nums) {
        int firstLarget = Integer.MIN_VALUE;
        int secondLarget = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] > firstLarget) {
                firstLarget = nums[i];
                secondLarget = firstLarget;
            }
        }

        int firstMinimum = Integer.MAX_VALUE;
        int secondMinimum = 0;
        for (int i = 1; i < nums.length - 1; i += 2) {
            if (nums[i] < firstMinimum) {
                firstMinimum = nums[i];
                secondMinimum = firstMinimum;
            }
        }
        return secondLarget + secondMinimum;
    }
}