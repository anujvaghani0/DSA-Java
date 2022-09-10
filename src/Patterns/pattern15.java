package Patterns;

public class pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
          for (int col=0;col<=(n*2)-row;col++){
              if (col<=row){
                  System.out.print(" ");
              } else if (col<=row+1 || col==(n*2+1)-row) {
                  System.out.print("X ");
              }else{
                  System.out.print(" ");
              }
          }
            System.out.println();
        }
    }
}
