package Recursion.BasicRecursion;

public class StepsToReduceANumberToZero {
    public static void main(String[] args) {

    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int num, int step) {
        if (num == 0) {
            return step;
        }
        if (num % 2 == 0) {
            return helper(num / 2, step + 1);
        } else {
            return helper(num - 1, step + 1);
        }
    }
}
