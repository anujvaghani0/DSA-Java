package Arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] < arr[start + 1]) {
                start++;
            } else if (arr[end - 1] > arr[end]) {
                end--;
            } else {
                break;
            }
        }
        return start != 0 && end != arr.length - 1 && start == end;
    }
}
