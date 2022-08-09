package Searching;

public class minimumNumberSearching {
    public static void main(String[] args) {
        int[] arr = {70, 47, 12, 17, 69, 56, 57, 3222, 450};
        int ans = serach(arr);
        System.out.println(ans);
    }

    static int serach(int[] arr) {
        int ans = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (ans < arr[index]) {
                ans = arr[index];
            }
        }
        return ans;
    }
}
