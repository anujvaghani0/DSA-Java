package Searching;

public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
//    int[] arr={5, 1, 2, 3, 4};
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(count(arr));
    }

    public static int count(int[] arr) {
        int count = pivot(arr);
//        if (count==-1){
//            return 0;
//        }
        return count + 1;
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
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
