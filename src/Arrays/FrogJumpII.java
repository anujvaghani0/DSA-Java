package Arrays;

// Question link -> https://leetcode.com/problems/frog-jump-ii/

public class FrogJumpII {
    public static void main(String[] args) {
        int[] stones = {0, 3, 9};
        System.out.println(maxJump(stones));
    }

    public static int maxJump(int[] stones) {
        int currentAns = stones[1] - stones[0];
        for (int i = 2; i < stones.length; i++) {
            int ans = stones[i] - stones[i - 2];
            currentAns = Math.max(currentAns, ans);
        }
        return  currentAns;
    }
}
