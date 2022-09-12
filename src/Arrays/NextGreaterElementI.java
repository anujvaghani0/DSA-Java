package Arrays;

import java.util.Arrays;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] num1 = {2, 4};
        int[] num2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            ans[i] = nums2[k];
                            break;
                        } else {
                            ans[i] = -1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
