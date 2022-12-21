package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/surrounded-regions/

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        solve(board);
    }

    public static void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[] nrow = {-1, 0, +1, 0};
        int[] ncol = {0, 1, 0, -1};
        int[][] visited = new int[n][m];

        for (int j = 0; j < m; j++) {

//            first row
            if (visited[0][j] == 0 && board[0][j] == 'O') {
                dfs(0, j, visited, board, nrow, ncol);
            }

//            last row
            if (visited[n - 1][j] == 0 && board[n - 1][j] == 'O') {
                dfs(n - 1, j, visited, board, nrow, ncol);
            }
        }
        for (int i = 0; i < n; i++) {
//                First column
            if (visited[i][0] == 0 && board[i][0] == 'O') {
                dfs(i, 0, visited, board, nrow, ncol);
            }

//            last column
            if (visited[i][m - 1] == 0 && board[i][m - 1] == 'O') {
                dfs(i, m - 1, visited, board, nrow, ncol);
            }
        }

//            changes the visited matrix
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (visited[i][k] == 0 && board[i][k] == 'O') {
                    board[i][k] = 'X';
                }
            }
        }
    }

    private static void dfs(int row, int col, int[][] visited, char[][] board, int[] drow, int[] dcol) {
        visited[row][col] = 1;
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && visited[nrow][ncol] == 0 && board[nrow][ncol] == 'O') {
                dfs(nrow, ncol, visited, board, drow, dcol);
            }
        }
    }
}