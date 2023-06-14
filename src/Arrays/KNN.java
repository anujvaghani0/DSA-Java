package Arrays;

import java.util.Scanner;

public class KNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        String[] c = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the X");
            x[i] = sc.nextInt();
            System.out.println("Enter the Y");
            y[i] = sc.nextInt();
            System.out.println("Enter the class");
            c[i] = sc.next().toUpperCase();
        }
        System.out.println("Enter the X1 values ");
        int x1 = sc.nextInt();
        System.out.println("Enter the y1 values ");
        int y1 = sc.nextInt();
        double[] s1 = euclidean(x, y, x1, y1, n, c);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (s1[j] > s1[j + 1]) {
                    double temp = s1[j];
                    s1[j] = s1[j + 1];
                    s1[j + 1] = temp;
                    String temp1 = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s1[i] + "," + c[i]);
        }
        System.out.println("Enter the K");
        int k = sc.nextInt();
        int good = 0;
        int bad = 0;
        for (int i = 0; i < k; i++) {
            if (c[i].equals("GOOD")) {
                good++;
            } else {
                bad++;
            }
        }
        if (good > bad) {
            System.out.println("GOOD ");
        } else {
            System.out.println("BAD ");
        }
    }

    private static double[] euclidean(int[] x, int[] y, int x1, int y1, int n, String[] c) {
        double[] sum1 = new double[n];
        double[] sum2 = new double[n];
        double[] s1 = new double[n];
        double[] sum = new double[n];
        for (int i = 0; i < n; i++) {
            sum1[i] = Math.pow(x[i] - x1, 2);
            sum2[i] = Math.pow(y[i] - y1, 2);
            sum[i] = (sum1[i] + sum2[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            s1[i] = Math.sqrt(sum[i]);
        }
        return  s1;
    }
}
