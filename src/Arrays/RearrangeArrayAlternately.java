package Arrays;

// Question link -> https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        long[] ans = {1, 2, 3, 4, 5, 6};
        rearrange(ans, ans.length);
    }

    public static void rearrange(long[] arr, int n) {
        long m = arr[n - 1] + 1;
        int maximum = n - 1;
        int minimum = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                long values = arr[maximum] % m;
                arr[i] += values * m;
                maximum--;
            } else {
                long values = arr[minimum] % m;
                arr[i] += values * m;
                minimum++;
            }
            flag = !flag;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / m;
        }
    }
}
