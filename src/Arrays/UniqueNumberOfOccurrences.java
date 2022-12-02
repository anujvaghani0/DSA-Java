package Arrays;

// Question link -> https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.Arrays;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10,10,10, 0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        boolean[] occurrences = new boolean[1000];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            if (occurrences[count]) {
                return false;
            } else {
                occurrences[count] = true;
            }
        }
        return true;
    }
}
