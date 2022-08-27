package sorting;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {14};
//        int[] arr={17};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }

    public static int thirdMax(int[] arr) {
//        Arrays.sort(arr);
        if(arr.length<3){
            return arr.length;
        }
        if(arr.length==1){
            return arr[0];
        }
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        if (second==Integer.MIN_VALUE){
            return first;
        }
        if (third==Integer.MIN_VALUE){
            return first;
        }
        return third;
    }
}
