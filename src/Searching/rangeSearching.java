package Searching;

public class rangeSearching {
    public static void main(String[] args) {
        int[] arr = {70, 47, 12, 17, 69, 56, 57, 32, 45};
        int target = 56;
        System.out.println(search(arr, 1, 5, target));
    }

    static boolean search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = start; index <= end; index++) {
            if (target == arr[index]) {
                return true;
            }
        }
        return false;
    }

}
