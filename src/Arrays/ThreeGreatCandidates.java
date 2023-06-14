package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ThreeGreatCandidates {
    public static void main(String[] args) {
    int[] arr={10, 3, 5, 6, 20};
        System.out.println(maxProduct(arr, arr.length));
    }

    public static long maxProduct(int[] arr, int n) {
        Arrays.sort(arr);
        long ans = 1;
        for (int i = n - 1; i >= n - 3; i--) {
            ans *= arr[i];
        }
        return  ans;
    }
}
