package Math;

public class SumMultiples {
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(9));
    }

    public static int sumOfMultiples(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return (int) sum;
    }
}
