package Arrays;

//question link -> https://leetcode.com/problems/most-frequent-even-element/

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] numbs = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(numbs));
    }

    public static int mostFrequentEven(int[] nums) {
        int[] arr = new int[100001];
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[nums[i]]++;
                if ((arr[ans] < arr[nums[i]]) || ((arr[ans] == arr[nums[i]]) && ans > nums[i])) {
                    ans = nums[i];
                }
            }
        }
        return ans == 1 ? -1 : ans;
    }
}