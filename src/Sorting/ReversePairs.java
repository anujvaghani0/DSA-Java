package Sorting;

import java.util.ArrayList;

public class ReversePairs {
    public static void main(String[] args) {
    int[] nums={1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }


    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int mergeSort(int[] num, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;
        int count = mergeSort(num, low, mid);
        count += mergeSort(num, mid + 1, high);
        count += merge(num, low, mid, high);
        return count;
    }

    private static int merge(int[] num, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && num[i] > (2 * (long) num[j])) {
                j++;
            }
            count += (j - (mid + 1));
        }


        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (num[left] <= num[right]) {
                temp.add(num[left++]);
            } else {
                temp.add(num[right++]);
            }
        }
        while (left <= mid) {
            temp.add(num[left++]);
        }

        while (right <= high) {
            temp.add(num[right++]);
        }

        for (int i = low; i <= high; i++) {
            num[i] = temp.get(i - low);
        }

        return count;
    }
}
