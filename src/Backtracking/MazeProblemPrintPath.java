package Backtracking;

public class MazeProblemPrintPath {
    public static void main(String[] args) {
        pathPrint("", 3, 3);
    }

    public static void pathPrint(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            pathPrint(p + 'D', r - 1, c);
        }
        if (c > 1) {
            pathPrint(p + 'R', r, c - 1);
        }
    }
}