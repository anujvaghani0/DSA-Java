package Math;

import java.util.HashMap;
import java.util.Map;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] num1 = {1000000000, 1000000000};
        int[] num2 = {1000000000};
        System.out.println(getCommon(num1, num2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
}
