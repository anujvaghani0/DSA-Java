package Arrays;

//question link -> https://leetcode.com/problems/maximum-consecutive-floors-without-special-floors/

import java.util.Arrays;

public class MaximumConsecutiveFloorsWithoutSpecialFloors {
    public static void main(String[] args) {
        int[] arr = {4, 6};
        System.out.println(maxConsecutive(2, 9, arr));
    }

    public static int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int ans = Math.max(special[0] - bottom, top - special[special.length - 1]);
        for (int i = 1; i < special.length; i++) {
            ans = Math.max(ans, special[i] - special[i - 1] - 1);
        }
        return ans;
    }
}