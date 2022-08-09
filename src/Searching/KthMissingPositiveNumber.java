package Searching;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
    public static int findKthPositive(int[] arr, int k) {
        for (int i=0;i<arr.length;i++){
            int diffrent=arr[i]-(i+1);
            if (diffrent>=k){
                return i+k;
            }
        }
        return arr.length+k;
    }
}
