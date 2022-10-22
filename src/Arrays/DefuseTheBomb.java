package Arrays;

//question link -> https://leetcode.com/problems/defuse-the-bomb/

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] nums = {5, 7, 1, 4};
        int[] nums1 = {2,4,9,3};
        System.out.println(Arrays.toString(decrypt(nums1, -2)));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        int start = 1;

        int end = k;
        int sum = 0;
        if (k < 0) {
            k = -k;
            start = code.length - k;
            end = code.length - 1;
        }
        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i < code.length; i++) {
            ans[i] = sum;
            sum -= code[(start++) % code.length];
            sum += code[(++end) % code.length];
        }
        return ans;
    }
}
