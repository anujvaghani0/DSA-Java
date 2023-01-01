package GreedyAlgorithm;

// Question link -> https://leetcode.com/problems/maximum-split-of-positive-even-integers/

import java.util.ArrayList;
import java.util.List;

public class MaximumSplitOfPositiveEvenIntegers {
    public static void main(String[] args) {
        System.out.println(maximumEvenSplit(34));
    }

    public static List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans = new ArrayList<>();

//      if the final sum is odd return the empty list
        if (finalSum % 2 != 0) {
            return new ArrayList<>();
        }

        long currentNumber = 0;
        long currentSum = 0;
        while (currentSum < finalSum) {
            currentNumber += 2;
            currentSum += currentNumber;
            ans.add(currentNumber);
        }

        if (currentSum != finalSum) {
            long difference = currentSum - finalSum;
            ans.remove((int) (difference / 2) - 1);
        }
        return ans;
    }
}
