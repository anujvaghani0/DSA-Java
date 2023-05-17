package Matrix;

public class SpiralMatrixIII {
    public static void main(String[] args) {

    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows * cols][2];
        int k = 0;
        int rEnd = rStart + 1;
        int cEnd = cStart + 1;

        while (true){
//            right
            for (int i = cStart; i <= cEnd ; i++) {
                if (i<cols && i>=0 && rStart>=0){
                    matrix[k][0]=rStart;
                    matrix[k][1]=i;
                    k++;
                }
            }

            cStart--;
            cEnd++;
        }

    }
}
