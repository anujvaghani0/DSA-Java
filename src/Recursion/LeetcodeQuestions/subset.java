package Recursion.LeetcodeQuestions;

// Question link -> https://leetcode.com/problems/subsets/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] num = {3,1,2,4};
        List<List<Integer>> ans = subsets(num);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] arr) {
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
        }
        return outer;
    }
}
