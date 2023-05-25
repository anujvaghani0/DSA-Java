package Accenture;

public class p1 {
    public static void main(String[] args) {
        int[] nums = {2, 8, 3, 5, 8, 7, 4, 1};
        System.out.println(house(nums, 7, 2, 8));
    }

    public static int house(int[] nums, int r, int unit, int n) {
        int temp = unit * r;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum < temp) {
                sum += nums[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
