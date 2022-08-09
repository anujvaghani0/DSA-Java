package Searching;

import java.util.Arrays;

public class searching2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 4;
        int[] ans = search54(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search54(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
