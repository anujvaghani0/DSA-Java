package Searching.BinarySearchQuestion;

//question link -> https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?page=1&category

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        ArrayList<Long> ans = new ArrayList<>();
        System.out.println(find(arr, 9, 5));
    }

    public static ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> ans = new ArrayList<>();
        ans.add((long) firstOccurrences(arr, x));
        ans.add((long) secondOccurrences(arr, x));
        return ans;
    }

    private static int firstOccurrences(long[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x > arr[mid]) {
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else if (arr[mid] == x) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    private static int secondOccurrences(long[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x > arr[mid]) {
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else if (arr[mid] == x) {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
