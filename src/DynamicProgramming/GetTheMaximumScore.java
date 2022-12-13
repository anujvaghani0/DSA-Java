package DynamicProgramming;

// Question link -> https://leetcode.com/problems/get-the-maximum-score/

public class GetTheMaximumScore {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 9};
        int[] nums2 = {3, 5, 100};
        System.out.println(maxSum(nums1, nums2));
    }

    public static int maxSum(int[] nums1, int[] nums2) {
        long currentSum = 0;
        long sum1 = 0;
        long sum2 = 0;
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                currentSum += Math.max(sum1, sum2) + nums2[j];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                sum1 += nums1[i++];
            } else {
                sum2 += nums2[j++];
            }
        }

        while (i < nums1.length) {
            sum1 += nums1[i++];
        }

        while (j < nums2.length) {
            sum2 += nums2[j++];
        }

        return (int) ((currentSum + Math.max(sum1, sum2)) % 100000007);
    }
}
