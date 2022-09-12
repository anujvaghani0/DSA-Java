package Matrix;

public class TWODBinarySearch {
    public static void main(String[] args) {

    }
    public static int[] binarySerach(int[][] matrix, int row, int cstart, int cEnd, int target) {
        while (cstart <= cEnd) {
            int mid = cstart + (cEnd - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

//
//    public static int[] search(int[][] matrix, int target) {
//        int row = matrix.length;
//        int cols = matrix[0].length;
//        if (cols == 0) {
//            return new int[]{-1, -1};
//        }
//        if (cols == 1) {
//            return binarySerach(matrix, 0, 0, cols - 1, target);
//        }
//        int rStart = 0;
//        int rEnd = row - 1;
//        int cMid = cols / 2;
//        while (rStart < (rEnd - 1)) {
//            int rmid = rStart + (rStart - rEnd) / 2;
//            if (matrix[rmid][cMid] == target) {
//                return new int[]{rmid, cMid};
//            }
//            if (matrix[rmid][cMid] < target) {
//                rStart = rmid;
//            } else {
//                rEnd = rmid;
//            }
//        }
//
//        if (matrix[rStart][cMid] == target) {
//            return new int[]{rStart, cMid};
//        }
//        if (matrix[rStart + 1][cMid] == target) {
//            return new int[]{rStart + 1, cMid};
//        }
////        if (target <=)
//
//    }
}
