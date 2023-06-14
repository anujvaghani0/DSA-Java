package Arrays;

import java.util.ArrayList;
import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);
        for (int n : set1) {
            if (!set2.contains(n)) {
                ans1.add(n);
            }
        }
        for (int n : set2) {
            if (!set1.contains(n)) {
                ans2.add(n);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return  ans;
    }
}
