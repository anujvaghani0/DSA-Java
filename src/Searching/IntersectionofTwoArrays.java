package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 2, 1};
        int[] num2 = {2, 2, 2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
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
        List<Integer> newList = ans.stream()
                .distinct()
                .collect(Collectors.toList());
        int[] result = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            result[i] = newList.get(i);
        }
        return result;
    }
}
