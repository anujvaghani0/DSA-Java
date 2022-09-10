package Arrays;

import java.util.Scanner;

public class InverseOfA3x3Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        double determinant = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix values : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            determinant = determinant + (arr[0][i]
                    * (arr[1][(i + 1) % 3] * arr[2][(i + 2) % 3] - arr[1][(i + 2) % 3] * arr[2][(i + 1) % 3]));
        }
        System.out.println("Ans Of Determinant:- "+determinant);
        System.out.println(determinant);

        System.out.println("inverse method");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(((arr[(i + 1) % 3][(j + 1) % 3] * arr[(i + 2) % 3][(j + 2) % 3])
                        - (arr[(i + 1) % 3][(j + 2) % 3] * arr[(i + 2) % 3][(j + 1) % 3])) / determinant + "  ");
            }
            System.out.println();
        }
    }
}
