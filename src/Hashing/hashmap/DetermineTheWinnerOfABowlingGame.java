package Hashing.hashmap; 

public class DetermineTheWinnerOfABowlingGame {
    public static void main(String[] args) {
    int[] player1={4,10,7,9};
    int[] player2={6,5,2,3};
        System.out.println(isWinner(player1,player2));

    }


    public static int isWinner(int[] player1, int[] player2) {
        int sum1 = 0;
        int sum2 = 0;
        boolean b1 = false;
        boolean b2 = false;
        for (int i = 0; i < player1.length; i++) {
            b1 = (i > 0 && player1[i - 1] == 10) || (i > 1 && player1[i - 2] == 10);
            b2 = (i > 0 && player2[i - 1] == 10) || (i > 1 && player2[i - 2] == 10);
            sum1 += b1 ? (2 * player1[i]) : player1[i];
            sum2 += b2 ? (2 * player2[i]) : player2[i];
        }
        if (sum1 > sum2) {
            return 1;
        } else if (sum1 < sum2) {
            return 2;
        }
        return 0;
    }
}
