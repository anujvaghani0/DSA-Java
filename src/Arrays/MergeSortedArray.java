package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, 3, arr2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int z = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[z] = nums1[i];
                i--;
                z--;
            } else {
                nums1[z] = nums2[j];
                j--;
                z--;
            }
        }

//        2nd Solutions
//
//        int i=0;
//        int j=0;
//        int k=0;
//        while (i < nums1.length) {
//            if (nums1[i] < nums2[j]) {
//                i++;
//            } else if (nums1[i]==nums2[j]) {
//                i++;
//            } else {
//                nums1[k] = nums2[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<m){
//            i++;
//            k++;
//        }
//        while (j<n){
//            nums1[k] = nums2[j];
//            j++;
//            k++;
//        }
//        System.out.println(Arrays.toString(nums1));


    }
}
