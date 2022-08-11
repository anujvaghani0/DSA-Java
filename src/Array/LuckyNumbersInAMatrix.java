package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };

        List<Integer> ans = luckyNumbers(arr);
        System.out.println(ans);
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int r = 0, c = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                r = Math.min(matrix[i][0], matrix[i][j]);
            }
            ans.add(r);
        }

//        for (int j = 0; j < m; j++) {
//            for (int i = 0; i < n; i++) {
//            }
//            ans1.add(c);
//        }
//        ans.retainAll(ans1);
        return ans;
    }
}
