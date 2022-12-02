package SlidingWindow;

// Question link -> https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstNegativeIntegernEveryWindowOfSizeK {
    public static void main(String[] args) {
        long[] arr = {-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(arr, arr.length, 2)));
    }

    public static long[] printFirstNegativeInteger(long[] arr, int N, int k) {
        long[] ans = new long[N - k + 1];
        int j = 0;
        int i = 0;
        List<Long> temp = new ArrayList<>();
        while (j < N) {
            if (arr[j] < 0) {
                temp.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else {
                if (temp.size() == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = temp.get(0);
                    if (temp.get(0) == arr[i]) {
                        temp.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
