package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] ans = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] ans1 = removeDuplicates(ans);
        System.out.println(Arrays.toString(ans1));
    }

    public static int[] removeDuplicates(int[] arr) {
        int len = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ans.add(arr[i]);
            }
        }
        ans.add(arr[len - 1]);
        int[] ans1 = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}
