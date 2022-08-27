package Recursion.Arrays;

public class arraySort {
    public static void main(String[] args) {
    int[] arr={10,20,30,60,50};
        System.out.println(sort(arr,0));
    }

    public static boolean sort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sort(arr, index + 1);
    }
}