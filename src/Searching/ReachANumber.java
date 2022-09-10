package Searching;

public class ReachANumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int count = 0;
        while (true) {
            count++;
            long ans = (long) count * (count + 1) / 2;
            if (ans >= (long) target) {
                long left = (ans - target);
                if (left % 2 == 0) {
                    break;
                }
            }
        }
        return count;
    }
}
