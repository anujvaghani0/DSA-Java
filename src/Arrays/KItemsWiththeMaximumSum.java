package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KItemsWiththeMaximumSum {
    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 2));
    }

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        List<Integer> temp = new ArrayList<>();

//        for numOnes
        for (int i = 0; i < numOnes; i++) {
            temp.add(1);
        }

//        for numZeros
        for (int i = 0; i < numZeros; i++) {
            temp.add(0);
        }

//        for numNegOnes
        for (int i = 0; i < numNegOnes; i++) {
            temp.add(-1);
        }
        int sum = 0;
//        kth sum
        for (int i = 0; i < k; i++) {
            sum += temp.get(i);
        }
        return sum;
    }
}
