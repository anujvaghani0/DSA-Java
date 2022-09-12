package Matrix;

import java.util.Scanner;

public class DeterminantOfA3x3Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix values");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x, y, z = 0;
        int determinant = 0;
        x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
        y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
        z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);
        determinant = (arr[0][0] * x) - (arr[0][1] * y) + (arr[0][2] * z);
        System.out.println("Ans:- "+determinant);
    }
}
