package Patterns;

public class pattern33 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int lower = 97;
        int upper = 65;
        boolean flag = true;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (flag) {
                    System.out.print((char) (lower) + " ");
                    flag = false;
                    upper++;
                    lower++;
                } else {
                    System.out.print((char) (upper) + " ");
                    flag = true;
                    lower++;
                    upper++;
                }
            }
            System.out.println();
        }
    }
}