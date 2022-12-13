package Math;

// Question link -> https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list, previous = null;

        for (int i = 0; i < numRows; i++) {
            list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(previous.get(j - 1) + previous.get(j));
                }
            }
            previous = list;
            ans.add(list);
        }
        return ans;
    }
}
