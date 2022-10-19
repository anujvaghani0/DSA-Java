package Recursion.Arrays;

import java.util.ArrayList;

public class ArrayListLinerSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 6, 70, 5, 47, 85, 70, 47};
        ArrayList<Integer> ans = findAllIndex1(arr, 437, 0, new ArrayList<>());
        System.out.println(ans);
    }

    public static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index,
                                                   ArrayList<Integer> list) {
        if (arr.length == index) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);
    }
}
