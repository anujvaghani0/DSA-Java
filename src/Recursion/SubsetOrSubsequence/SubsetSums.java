package Recursion.SubsetOrSubsequence;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();

        helper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    private static void helper(int index, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sumSubset) {
        if (index == n) {
            sumSubset.add(sum);
            return;
        }

//        pick the element
        helper(index + 1, sum + arr.get(index), arr, n, sumSubset);

//        not pick the element
        helper(index + 1, sum, arr, n, sumSubset);
    }
}
