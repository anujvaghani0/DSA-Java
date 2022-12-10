package Sorting;

import java.util.Arrays;

public class TwoArraysEqualByReversingSubArrays {
    public static void main(String[] args) {
        int[] target={1,2,3};
        int[] arr={2,2,2};
        System.out.println(canBeEqual(target,arr));
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<target.length;i++){
            if (target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}
