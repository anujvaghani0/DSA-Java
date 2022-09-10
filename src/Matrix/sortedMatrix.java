package Searching;

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 6, 4},
                {55, 9, 65, 8},
                {58, 53, 32, 12}
        };
        System.out.println(Arrays.toString(searching(arr)));
    }

    public static int[] searching(int[][] arr) {
        int[] oneD = new int[12];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=arr.length; j++) {
                k = (i * (arr.length+1)) + j;
                oneD[k] = arr[i][j];
            }

        }
        return oneD;
    }
}
