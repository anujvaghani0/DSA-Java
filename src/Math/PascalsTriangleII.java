package Math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
//        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list, previous = null;

        for (int i = 0; i <= rowIndex; i++) {
            list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(previous.get(j - 1) + previous.get(j));
                }
            }
            previous = list;
//            ans.add(list);
        }
        return previous;
    }
}
