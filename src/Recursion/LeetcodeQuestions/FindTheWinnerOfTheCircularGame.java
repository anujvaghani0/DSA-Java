package Recursion.LeetcodeQuestions;

// Question link -> https://leetcode.com/problems/find-the-winner-of-the-circular-game/

public class FindTheWinnerOfTheCircularGame {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }

    public static int findTheWinner(int n, int k) {
        return solve(n, k) + 1;
    }

    private static int solve(int n, int k) {
//        Base case
        if (n == 1) {
            return 0;
        }

        return (solve(n - 1, k) + k) % n;
    }
}
