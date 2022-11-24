package Recursion.LeetcodeQuestions;

// Question link -> https://leetcode.com/problems/subsets-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetII {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        List<List<Integer>> list = subsetsWithDup(arr);
        System.out.println(list);
    }

    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int end = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
            start = 0;
        }
        return outer;
    }
}
