package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
    int[] arr={2,3,6,7};
        System.out.println(combinationSum(arr,7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombination(int index, int[] candidates, int target,
                                        List<List<Integer>> ans, List<Integer> ds) {
        if (index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            findCombination(index, candidates, target - candidates[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(index + 1, candidates, target, ans, ds);
    }
}
