package Searching;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = {70, 47, 12, 17, 69, 56, 57, 32, 45};
        int target = 120;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
