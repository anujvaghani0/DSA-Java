package Searching.BinarySearchQuestion;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int target = 3;
        System.out.println(seraching(arr, target));
    }

    //    public static boolean search(int[] nums, int target) {
//        int ans=seraching(nums,target);
//        if (ans!=-1){
//            return true;
//        }
//     return false;
//    }
    public static int seraching(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            return Bsearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return Bsearch(arr, target, 0, pivot - 1);
        }
        return Bsearch(arr, target, pivot + 1, arr.length - 1);
    }


    public static int Bsearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[end] <= arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }
        }
        return -1;
    }
}
