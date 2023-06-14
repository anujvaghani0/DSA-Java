package Arrays;

//question link -> https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1};
        System.out.println(kLengthApart(arr, 2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int spaces = (int) 1e9;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (spaces < k) {
                    return  false;
                }
                spaces = 0;
            } else {
                spaces++;
            }
        }
        return  true;
    }
}
