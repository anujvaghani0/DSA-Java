package Searching;

public class orderAgnositcBinarySerach {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 6, 8, 9, 15, 45};
        int[] arr = {70, 69, 54, 47, 42, 32, 17, 12, 3};
        int target = 54;
        int ans = orderBinary(arr, target);
        System.out.println(ans);
    }

    public static int orderBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
