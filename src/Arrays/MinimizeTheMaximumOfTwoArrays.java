package Arrays;

public class MinimizeTheMaximumOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(minimizeSet(9, 4, 8, 3));
    }

    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int[] ans1 = new int[uniqueCnt1];
        int[] ans2 = new int[uniqueCnt2];
        int high = Math.max(divisor1, divisor2);
        int max = Integer.MIN_VALUE;
        int countHigh = Math.max(uniqueCnt1, uniqueCnt2);
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i < high * countHigh * divisor2 * divisor1; i++) {
//            if (divisor1  divisor2) {
                if (i % divisor1 != 0 && ans1.length > count1) {
                    ans1[count1++] = i;
                    max = Math.max(max, i);
                } else if (i % divisor2 != 0 && ans2.length > count2) {
                    ans2[count2++] = i;
                    max = Math.max(max, i);
                } else {
                    continue;
                }
//            }
//            else if (divisor1 > divisor2) {
//                if (i % divisor2 != 0 && ans2.length > count2) {
//                    ans2[count2++] = i;
//                    max = Math.max(max, i);
//                } else if (i % divisor1 != 0 && ans1.length > count1) {
//                    ans1[count1++] = i;
//                    max = Math.max(max, i);
//                } else {
//                    continue;
//                }
//            }
        }
        return  max;
    }
}
