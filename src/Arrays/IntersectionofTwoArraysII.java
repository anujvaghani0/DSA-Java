package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 2, 5, 6, 7};
        int[] nums1 = {2, 2, 3};
        int[] ans = intersect(nums, nums1);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                ans.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
