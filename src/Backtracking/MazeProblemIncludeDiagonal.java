package Backtracking;

import java.util.ArrayList;

public class MazeProblemIncludeDiagonal {
    public static void main(String[] args) {
        System.out.println(pathPrintWithDiagonal("",3,3));
    }

    public static ArrayList<String> pathPrintWithDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1) {
            ans.addAll(pathPrintWithDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            ans.addAll(pathPrintWithDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathPrintWithDiagonal(p + 'H', r, c - 1));
        }
        return ans;
    }
}
