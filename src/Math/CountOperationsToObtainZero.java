package Math;

// Question link -> https://leetcode.com/problems/count-operations-to-obtain-zero/

public class CountOperationsToObtainZero {
    public static void main(String[] args) {
        System.out.println(countOperations(2, 4));
    }

    public static int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else if (num2 > num1) {
                num2 -= num1;
            } else {
                return count + 1;
            }
            count++;
        }
        return count;
    }
}
