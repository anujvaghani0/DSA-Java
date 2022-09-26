package Strings;

public class DetermineColorOAChessboardSquare {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("b1"));
    }

    public static boolean squareIsWhite(String coordinates) {
        int first=coordinates.charAt(0);
        int second=coordinates.charAt(1);
        int total=first+second;
        return total % 2 != 0;
    }
}
