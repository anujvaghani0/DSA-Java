package Matrix;

public class SearchA2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        return false;
    }
}