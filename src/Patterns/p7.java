package Patterns;

public class p7 {
    public static void main(String[] args) {
        patten(5);
    }
    public static void patten(int n){
        for (int row=0;row<=n;row++){
            int c = row > n ? 2 * n - row : row;
            for (int spece=0;spece<row;spece++){
                System.out.print("  ");
            }
            for (int col=1;col<=n-row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
