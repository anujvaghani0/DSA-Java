package Recursion;

public class ReverseSeries {
    public static void main(String[] args) {
    series(5);
    }
    public static void series(int n){
        if (n==0){
            return;
        }
        series(n-1);
        System.out.println(n);
    }
}
