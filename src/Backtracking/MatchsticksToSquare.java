package Backtracking;

import java.util.Arrays;

public class MatchsticksToSquare {
    public static void main(String[] args) {

    }

    public static boolean makesquare(int[] matchsticks) {
        int perimeter = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            perimeter += matchsticks[i];
        }

        if (perimeter % 4 != 0) {
            return false;
        }

        int side = perimeter / 4;

        Arrays.sort(matchsticks);

//        square
        int[] square = new int[4];
        int length = matchsticks.length;

        return backtrack(matchsticks, length - 1, square, side);
    }

    private static boolean backtrack(int[] sticks, int index, int[] square, int side) {
        if (index == -1) {
            return true;
        }

        for (int i = 0; i < 4; i++) {
            if (square[i] + sticks[index] <= side) {
                square[i] += sticks[index];
                if (backtrack(sticks, index - 1, square, side)) {
                    return true;
                }
//                If it is not right backtrack sticks
                square[i] -= sticks[index];
            }
        }
        return false;
    }
}
