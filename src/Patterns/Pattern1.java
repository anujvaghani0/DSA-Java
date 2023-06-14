package Patterns; 

public class Pattern1 {
    public static void main(String[] args) {
        patten(4);
    }

    public static void patten(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
