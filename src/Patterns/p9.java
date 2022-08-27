package Patterns;

public class p9 {
    public static void main(String[] args) {
    patten(5);
    }
    public static void patten(int n){
        for (int row=0;row<=n;row++){
            for (int spece=0;spece<row;spece++){
                System.out.print("  ");
            }
            for (int col=1;col<(n-row)*2;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
