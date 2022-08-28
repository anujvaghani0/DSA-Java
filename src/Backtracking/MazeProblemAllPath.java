package Backtracking;

public class MazeProblemAllPath {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("",maze,0,0);
    }

    public static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }
        if (r < maze.length-1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length-1) {
            allPath(p + 'R', maze, r, c + 1);
        }

        maze[r][c] = true;
    }
}
