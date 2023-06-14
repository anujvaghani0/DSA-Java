package Graph.BFS_DFS; 

// Question link -> https://leetcode.com/problems/number-of-enclaves/

public class NumberOfEnclaves {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        System.out.println(numEnclaves(grid));
    }

    public static int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] nrow = {-1, 0, +1, 0};
        int[] ncol = {0, 1, 0, -1};
        int[][] visited = new int[n][m];

        for (int j = 0; j < m; j++) {

//            first row
            if (visited[0][j] == 0 && grid[0][j] == 1) {
                dfs(0, j, visited, grid, nrow, ncol);
            }

//            last row
            if (visited[n - 1][j] == 0 && grid[n - 1][j] == 1) {
                dfs(n - 1, j, visited, grid, nrow, ncol);
            }
        }
        for (int i = 0; i < n; i++) {
//                First colum
            if (visited[i][0] == 0 && grid[i][0] == 1) {
                dfs(i, 0, visited, grid, nrow, ncol);
            }

//            last colum
            if (visited[i][m - 1] == 0 && grid[i][m - 1] == 1) {
                dfs(i, m - 1, visited, grid, nrow, ncol);
            }
        }

//            changes the visited matrix
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (visited[i][k] == 0 && grid[i][k] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int row, int col, int[][] visited, int[][] board, int[] drow, int[] dcol) {
        visited[row][col] = 1;
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && visited[nrow][ncol] == 0 && board[nrow][ncol] == 1) {
                dfs(nrow, ncol, visited, board, drow, dcol);
            }
        }
    }
}
