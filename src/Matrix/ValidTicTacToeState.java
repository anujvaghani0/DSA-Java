package Matrix;

//question link -> https://leetcode.com/problems/valid-tic-tac-toe-state/

public class ValidTicTacToeState {
    public static void main(String[] args) {
        String[] borad = {"XOX", "O O", "XOX"};
        System.out.println(validTicTacToe(borad));
    }

    public static boolean validTicTacToe(String[] board) {
        int turns = 0;
        boolean Xwinner = false;
        boolean Owinner = false;
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diagonal = 0;
        int antidiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') {
                    turns++;
                    rows[i]++;
                    cols[j]++;
                    if (i == j) {
                        diagonal++;
                    }
                    if (i + j == 2) {
                        antidiagonal++;
                    }
                } else if (board[i].charAt(j) == 'O') {
                    turns--;
                    rows[i]--;
                    cols[j]--;
                    if (i == j) {
                        diagonal--;
                    }
                    if (i + j == 2) {
                        antidiagonal--;
                    }
                }
            }
        }

        Xwinner = rows[0] == 3 || rows[1] == 3 || rows[2] == 3 || cols[0] == 3 || cols[1] == 3 || cols[2] == 3
                || diagonal == 3 || antidiagonal == 3;
        Owinner = rows[0] == -3 || rows[1] == -3 || rows[2] == -3 || cols[0] == -3 || cols[1] == -3 || cols[2] == -3
                || diagonal == -3 || antidiagonal == -3;

        if (Xwinner && turns == 0 || Owinner && turns == 1) {
            return false;
        }
        return (turns == 0 || turns == 1) && (!Xwinner || !Owinner);
    }
}