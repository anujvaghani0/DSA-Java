package Arrays;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(3)));
    }

    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = i * 2 - n + 1;
        }
        return ans;
    }
}
