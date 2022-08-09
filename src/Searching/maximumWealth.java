package Searching;

public class maximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{10, 5},
                {7, 3},
                {3, 5}
        };
        int ans = wealth(arr);
        System.out.println(ans);
    }

    public static int wealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = arr[i][j] + sum;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
