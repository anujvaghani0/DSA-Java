package Matrix;

public class SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        System.out.println(numSpecial(matrix));
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    if (colSum[j] <= 1 && rowSum[i] <= 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
