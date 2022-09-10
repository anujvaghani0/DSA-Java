package Searching;

import java.util.Arrays;

public class TWODArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 6, 4},
                {55, 9, 65, 8},
                {58, 53, 32, 12}
        };
        int target = 4;
        System.out.println(arr[0].length);
        int[] ans = seraching(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] seraching(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
