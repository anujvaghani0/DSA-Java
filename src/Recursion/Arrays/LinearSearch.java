package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 6, 70, 5, 47, 85, 70,47};
        System.out.println(find(arr, 70, 0));
        System.out.println(findIndex(arr, 70, 0));
        System.out.println(findIndexLast(arr, 70, arr.length - 1));
        findAllIndex(arr, 70, 0);
        System.out.println(ans);

    }

    public static boolean find(int[] arr, int target, int index) {
        if (arr.length == index) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    public static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index - 1);
    }

    static ArrayList<Integer> ans = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index) {
        if (arr.length == index) {
            return;
        }
        if (arr[index] == target) {
            ans.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}
