package DynamicProgramming;

public class TempleOfferings {
    public static void main(String[] args) {

    }

    public static int offerings(int N, int[] arr) {
//        left side of the array
        int[] leftArray = new int[N];
        leftArray[0] = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                leftArray[i] = leftArray[i - 1] + 1;
            } else {
                leftArray[i] = 1;
            }
        }

//        right side of yhe array

        int[] rightArray = new int[N];
        rightArray[0] = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                rightArray[i] = rightArray[i + 1] + 1;
            } else {
                rightArray[i] = 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.max(leftArray[i], rightArray[i]);
        }
        return ans;
    }
}
