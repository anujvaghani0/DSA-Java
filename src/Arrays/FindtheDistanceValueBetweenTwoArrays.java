package Arrays;

public class FindtheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        System.out.println(findTheDistanceValue(arr1, arr2, 2));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int temp = Math.abs(arr1[i] - arr2[j]);
                if (temp <= d) {
                    count++;
                }
            }
        }
        return count;
    }
}
