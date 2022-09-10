package Searching;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
    int[] alice={1,2};
    int[] bob={2,3};
        System.out.println(Arrays.toString(fairCandySwap(alice,bob)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            alice += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            bob += bobSizes[i];
        }
        int difference = (alice - bob) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == difference) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return null;
    }
}
