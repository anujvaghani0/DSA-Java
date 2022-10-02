package Arrays;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }
}