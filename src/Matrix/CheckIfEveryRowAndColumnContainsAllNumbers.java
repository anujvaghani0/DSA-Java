package Matrix;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3,2,1},{2,3,1}};
        System.out.println(checkValid(matrix));
    }

    public static boolean checkValid(int[][] matrix) {
        if (matrix.length == 1) {
            return true;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int k = 0;
        int temp = 0;
        boolean check = false;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                while (k < m) {
                    if (matrix[i][j] == matrix[k][i]) {
                        count++;
                        k++;
                        temp = k;
                        break;
                    } else {
                        k++;
                    }
                }
                k = temp;
            }
            k = 0;
            temp = 0;
            if (count == m) {
                check = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
