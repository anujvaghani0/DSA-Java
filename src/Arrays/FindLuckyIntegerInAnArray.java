package Arrays;

// Question link -> https://leetcode.com/problems/reverse-only-letters/

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int max = -1;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == i) {
                max = i;
            }
        }
        return  max;
    }
}
