package Recursion.Arrays;

import java.util.ArrayList;

public class ReturnTheListWithoutPassingTheArgument {
    public static void main(String[] args) {
        int[] arr = {10, 25, 6, 70, 5, 47, 85, 70,47};
        ArrayList<Integer> ans=findAllIndex1(arr,47,0);
        System.out.println(ans);
    }
    public static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if (arr.length == index) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow= findAllIndex1(arr, target, index + 1);
        list.addAll(ansFromBelow);
        return list;
    }
}
