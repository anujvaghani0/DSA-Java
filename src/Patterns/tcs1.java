package Patterns;

public class tcs1 {
    public static void main(String[] args) {
    patten(4);
    }
    public static void patten(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ((i==1 || i==n) || (j==1|| j==n)) {
                    System.out.print("*" + "  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
