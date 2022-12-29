package GreedyAlgorithm;

import java.util.Arrays;

// Question link -> https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/

public class MaximumBagsWithFullCapacityOfRocks {
    public static void main(String[] args) {
        int[] capacity = {2, 3, 4, 5};
        int[] rocks = {1, 2, 4, 4};
        System.out.println(maximumBags(capacity, rocks, 4));
    }

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remainingSpace = new int[capacity.length];
        for (int i = 0; i < remainingSpace.length; i++) {
            remainingSpace[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(remainingSpace);
        int ans = 0;
        for (int i = 0; i < capacity.length; i++) {
            if (remainingSpace[i] == 0) {
                ans++;
            } else {
                if (additionalRocks >= remainingSpace[i]) {
                    additionalRocks -= remainingSpace[i];
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}
