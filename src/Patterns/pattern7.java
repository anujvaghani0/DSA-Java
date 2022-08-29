package Patterns;

public class pattern7 {
    public static void main(String[] args) {
    patten(5);
    }

    public static void patten(int n) {
        for (int row=0;row<n;row++){
            for (int spece=0;spece<row;spece++){
                System.out.print("  ");
            }
            for (int col=n-row;col>0;col--){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
