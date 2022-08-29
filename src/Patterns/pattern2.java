package Patterns;

public class pattern2 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
