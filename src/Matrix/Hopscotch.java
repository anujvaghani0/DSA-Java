package Matrix;

// Question link -> https://practice.geeksforgeeks.org/problems/hopscotch4857/1

public class Hopscotch {
    public static void main(String[] args) {
        int[][] matrix = {{5, 9, 7}, {6, 4, 5}, {8, 1, 2}};
        System.out.println(hopscotch(3, 3, matrix, 1, 1, 1));
    }

    public static int hopscotch(int n, int m, int mat[][], int ty, int i, int j) {
        int ans = 0;
        if (ty == 0) {
            if (isValid(i + 1, j, n, m)) ans += mat[i + 1][j];    //down
            if (isValid(i - 1, j, n, m)) ans += mat[i - 1][j];    //up
            if (isValid(i, j + 1, n, m)) ans += mat[i][j + 1];    //right
            if (isValid(i, j - 1, n, m)) ans += mat[i][j - 1];    //left
            if (j % 2 == 0) {
                if (isValid(i - 1, j + 1, n, m)) ans += mat[i - 1][j + 1];    // right-up
                if (isValid(i - 1, j - 1, n, m)) ans += mat[i - 1][j - 1];    // left-up
            } else {
                if (isValid(i + 1, j + 1, n, m)) ans += mat[i + 1][j + 1];    // right-down
                if (isValid(i + 1, j - 1, n, m)) ans += mat[i + 1][j - 1];    // left-down
            }
        } else {
            if (isValid(i + 2, j, n, m)) ans += mat[i + 2][j];    // down
            if (isValid(i - 2, j, n, m)) ans += mat[i - 2][j];    // up
            if (isValid(i, j + 2, n, m)) ans += mat[i][j + 2];    // front
            if (isValid(i, j - 2, n, m)) ans += mat[i][j - 2];    // back
            if (j % 2 == 0) {
                if (isValid(i + 1, j + 1, n, m)) ans += mat[i + 1][j + 1];    // right-down
                if (isValid(i - 2, j + 1, n, m)) ans += mat[i - 2][j + 1];    // right-up
                if (isValid(i + 1, j - 1, n, m)) ans += mat[i + 1][j - 1];    // left-down
                if (isValid(i - 2, j - 1, n, m)) ans += mat[i - 2][j - 1];    // left-up

                if (isValid(i + 1, j + 2, n, m)) ans += mat[i + 1][j + 2];    // right-down-right-down
                if (isValid(i + 1, j - 2, n, m)) ans += mat[i + 1][j - 2];    // left-down-left-down
                if (isValid(i - 1, j + 2, n, m)) ans += mat[i - 1][j + 2];    // right-up-right-up
                if (isValid(i - 1, j - 2, n, m)) ans += mat[i - 1][j - 2];    // left-up-left-up
            } else {
                if (isValid(i - 1, j + 1, n, m)) ans += mat[i - 1][j + 1];    // right-up
                if (isValid(i + 2, j + 1, n, m)) ans += mat[i + 2][j + 1];    // right-down
                if (isValid(i - 1, j - 1, n, m)) ans += mat[i - 1][j - 1];    // left-up
                if (isValid(i + 2, j - 1, n, m)) ans += mat[i + 2][j - 1];    // left-down

                if (isValid(i - 1, j + 2, n, m)) ans += mat[i - 1][j + 2];    // right-up-right-up
                if (isValid(i - 1, j - 2, n, m)) ans += mat[i - 1][j - 2];    // left-up-left-up
                if (isValid(i + 1, j + 2, n, m)) ans += mat[i + 1][j + 2];    // right-down-right-down
                if (isValid(i + 1, j - 2, n, m)) ans += mat[i + 1][j - 2];    // left-down-left-down
            }
        }
        return ans;
    }

    private static boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }
}
