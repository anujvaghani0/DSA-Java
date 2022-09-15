package Arrays;

public class ElementAppearingMoreThan25PrecentagesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int count = 0;
        int MaxCount = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > MaxCount) {
                MaxCount = count;
                index = i;
            }
            count = 0;
        }
        return arr[index];
    }
}
