package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
        List<Integer> ans = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(ans);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans.add(nums1[i]);
//                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    ans.add(nums2[i]);
                    break;
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums3[i] == nums1[j]) {
                    ans.add(nums3[i]);
                    break;
                }
            }
        }
        List<Integer> newList = ans.stream()
                .distinct()
                .collect(Collectors.toList());
        return newList;
    }
}
