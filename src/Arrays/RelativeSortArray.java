package Arrays;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 19, 9, 2, 7};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int z = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    ans[z] = arr1[j];
                    z++;
                }
            }
        }
        int[] temp=new int[arr1.length-z];
        int k=0;
        boolean check = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            if (!check) {
                temp[k] = arr1[i];
                k++;
            }
        }
        Arrays.sort(temp);
        for (int i=0;i<temp.length;i++){
            ans[z]=temp[i];
            z++;
        }
        return ans;
    }
}
