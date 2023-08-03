package Backtracking;

import java.util.Arrays;

public class sudokuSolverUsingCharsArrays {
    public static void main(String[] args) {
        char[][] charArray = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(charArray);
        System.out.println(Arrays.deepToString(charArray));
    }

    public static void solveSudoku(char[][] board) {
        int[] complete = new int[1];
        solver(board, 0, 0, complete);
    }


    public static void solver(char[][] board, int row, int col, int[] complete) {
        if (row == board.length - 1 && col == board[0].length) {
            complete[0] = 1;
            return;
        }
        if (col == board[0].length) {
            solver(board, row + 1, 0, complete);
            return;
        }
        if (board[row][col] == '.') {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, (char) (i + '0'))) {
                    board[row][col] = (char) (i + '0');
                    solver(board, row, col + 1, complete);
                    if (complete[0] != 1) {
                        board[row][col] = '.';
                    }
                }
            }
        } else {
            solver(board, row, col + 1, complete);
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, char ch) {
        // check the row
        //row
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) {
                return false;
            }
        }
        //col
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}
