package Searching;

public class evenNumberSearching {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896, 2563, 56,2,56,256,11};
        System.out.println(evenDigit(arr));
    }

    public static int evenDigit(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int arr) {
        int numberOfDigit = digit(arr);
        return numberOfDigit % 2 == 0;
    }

    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
