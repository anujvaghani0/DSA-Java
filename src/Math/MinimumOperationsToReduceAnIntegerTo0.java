package Math;

public class MinimumOperationsToReduceAnIntegerTo0 {
    public static void main(String[] args) {
        System.out.println(minOperations(39));
    }

    public static int minOperations(int n) {
        int count = 0;
        while (n != 0) {

            int x = (int) Math.round(Math.log(n) / Math.log(2));
//            how far n is from it is the nearest power of 2
            int differences = n - (int) Math.pow(2, x);

//            in two conditions are follow first is difference exceed the zero and other is not exceed by zero
            if (differences >= 0) {
                n = n - (int) Math.pow(2, x);
            } else {
//                find the max power of n which can be added to n.
                int x1 = (int) Math.round(Math.log(-1 * differences) / Math.log(2));
//                n is added
                n = n + (int) Math.pow(2, x1);
            }
            count++;
        }
        return count;
    }
}
