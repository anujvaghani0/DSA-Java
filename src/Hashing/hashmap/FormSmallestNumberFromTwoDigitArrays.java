package Hashing.hashmap; 

import java.util.Arrays;
import java.util.HashMap;

public class FormSmallestNumberFromTwoDigitArrays {
    public static void main(String[] args) {
        int[] num1 = {3, 4, 1};
        int[] num2 = {2, 4, 5};
        System.out.println(minNumber(num1, num2));
    }

    public static int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], true);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                return nums2[i];
            }
        }
        return Math.min(nums1[0] * 10 + nums2[0], nums2[0] * 10 + nums1[0]);
    }
}
