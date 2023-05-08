package Matrix;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 2, 1}, {2, 3, 1}};
        System.out.println(checkValid(matrix));
    }

    public static boolean checkValid(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            int temp = 0;
            for (int j = 0; j < matrix.length; j++) {
                temp += matrix[i][j];
            }
            if (temp == sum) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
