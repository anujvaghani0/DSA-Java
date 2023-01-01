package Backtracking;

import java.util.Arrays;

public class MzeProblemMatrixAndPath {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true, false, true},
                            {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allMatrixPrint("", maze, 0, 0, path, 1);
    }

    public static void allMatrixPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r > 0) {
            allMatrixPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allMatrixPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        if (r < maze.length - 1) {
            allMatrixPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            allMatrixPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
