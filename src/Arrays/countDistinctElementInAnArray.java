package Arrays;

public class countDistinctElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};
        System.out.println(count(arr));
    }

    public static int count(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
