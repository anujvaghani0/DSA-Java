package Arrays;

//question link -> https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/0

public class EquilibriumPoint {
    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 2, 2};
        System.out.println(equilibriumPoint(arr, arr.length));
    }

    public static int equilibriumPoint(long[] arr, int n) {
        long sum = 0;
        long checksum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (checksum == sum) {
                return  i + 1;
            }
            checksum += arr[i];
        }
        return  -1;
    }
}
