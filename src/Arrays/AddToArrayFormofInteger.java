package Arrays;

//question link -> https://leetcode.com/submissions/detail/821770647/

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormofInteger {
    public static void main(String[] args) {
        int[] num = {0};
        System.out.println(addToArrayForm(num, 34));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; i--) {
            ans.add(0, (i >= 0 ? num[i] + k : k) % 10);
            k = (i >= 0 ? num[i] + k : k) / 10;
        }
        return ans;
    }
}