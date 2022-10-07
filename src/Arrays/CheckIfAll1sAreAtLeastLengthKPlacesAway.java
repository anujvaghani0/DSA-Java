package Arrays;

//question link -> https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0,1};
        System.out.println(kLengthApart(arr, 2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 1) {
                        break;
                    }
                    count++;
                }
            }
        }
        return count > k * k;
    }
}
