package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] ans = {4, 2, 1, 3};
        List<List<Integer>> ans1 = minimumAbsDifference(ans);
        System.out.println(ans1);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            if (difference < min) {
                min = difference;
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (difference == min) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}
