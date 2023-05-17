package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr,8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }

            temp.add(candidates[i]);
            findCombinations(index + 1, candidates, target - candidates[i], ans, temp);

            temp.remove(temp.size() - 1);
        }
    }
}
