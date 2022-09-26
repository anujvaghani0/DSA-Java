package Strings;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 1) {
            ans.add(nums[0] + "");
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (i + 1 < nums.length && (nums[i + 1] - nums[i] == 1)) {
                i++;
            }
            if (a != nums[i]) {
                ans.add(a + "->" + nums[i]);
            } else {
                ans.add(a + "");
            }
        }
        return ans;
    }
}
