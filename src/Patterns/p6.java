package Patterns;

public class p6 {
    public static void main(String[] args) {
    patten(5);
    }
    public static void patten(int n){
        for (int i=0;i<=n;i++){
              for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col <i; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
