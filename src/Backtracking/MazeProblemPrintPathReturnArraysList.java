package Backtracking;

import java.util.ArrayList;

public class MazeProblemPrintPathReturnArraysList {
    public static void main(String[] args) {
        System.out.println(pathPrint("",3,3));
    }

    public static ArrayList<String> pathPrint(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathPrint(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathPrint(p + 'R', r, c - 1));
        }
        return ans;
    }
}
