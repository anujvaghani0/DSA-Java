package Math;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(21));
    }

    public static int nextGreaterElement(int n) {
        int ans = 0;
        int num = n;
        while (n != 0) {
            int rem = n % 10;
            int temp = (10 * ans) + rem;
            ans = temp;
            n = n / 10;
        }
        return ans > num ? ans : -1;
    }
}
