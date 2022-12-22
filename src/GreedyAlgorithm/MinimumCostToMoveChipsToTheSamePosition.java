package GreedyAlgorithm;

// Question link -> https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        int[] positions={2,2,2,3,3};
        System.out.println(minCostToMoveChips(positions));
    }

    public static int minCostToMoveChips(int[] position) {
        int[] count = new int[2];
        for (int i = 0; i < position.length; i++) {
            count[position[i] % 2]++;
        }
        return Math.min(count[0], count[1]);
    }
}
