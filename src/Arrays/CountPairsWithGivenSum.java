package Arrays;

import java.util.Arrays;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
    int[] arr={1,1,1,1};
        System.out.println(getPairsCount(arr,arr.length,2));
    }

    public static int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int count = 0;
        while (left < right) {
            if (arr[left] + arr[right] == k) {
                count++;
                left++;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else if (arr[left] + arr[right] > k) {
                right--;
            }
        }
        return  count;
    }
}
