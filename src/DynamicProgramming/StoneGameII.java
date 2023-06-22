package DynamicProgramming;  

public class StoneGameII {
    public static void main(String[] args) {

    }

    public static boolean stoneGameIX(int[] stones) {
        int n = stones.length;
        int[][] dp = new int[n][n];
        int TotalStones = 0;
        for (int i=0;i< stones.length;i++){
            TotalStones+=stones[i];
        }
//        return (TotalStones+solve(stones,0,))
        return true;
    }
}
