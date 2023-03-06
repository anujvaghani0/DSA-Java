package Recursion.Premutation;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
    int[] nums={1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];
        Permutations(nums, ds, ans, visited);
        return ans;
    }

    private static void Permutations(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] visited) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                ds.add(nums[i]);
                Permutations(nums, ds, ans, visited);
                ds.remove(ds.size() - 1);
                visited[i] = false;
            }
        }
    }
}
