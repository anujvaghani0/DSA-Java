package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeIntervals {
    public static void main(String[] args) {
        int[][] ans = {{1, 3}, {4, 6}};
        int[][] anss = merge(ans);
        System.out.println(Arrays.toString(anss));
    }

    public static int[][] merge(int[][] intervals) {

        ArrayList<Integer> ans = new ArrayList<>();
        int index = 0;
        while (index < intervals.length) {
            int first = intervals[index][0];
            int second = intervals[index][1];
            int k = first;
            for (int i = first; i <= second; i++) {
                ans.add(k++);
            }
            index++;
        }

        List<Integer> newList = ans.stream()
                .distinct().toList();

        ArrayList<Integer> temp = new ArrayList<>();
        int count = 1;
        temp.add(newList.get(0));
        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i) - newList.get(i - 1) == 1) {
                continue;
            } else {
                count++;
                temp.add(newList.get(i - 1));
                temp.add(newList.get(i));
            }
        }

        temp.add(newList.get(newList.size() - 1));
        int[][] ansFinal = new int[count][2];
        int indexFinal = 0;
        for (int i = 0; i < temp.size() - 1; i++) {
            if (i % 2 == 0) {
                ansFinal[indexFinal][0] = temp.get(i);
            } else {
                ansFinal[indexFinal++][1] = temp.get(i);
            }
        }
        return ansFinal;
    }
}
