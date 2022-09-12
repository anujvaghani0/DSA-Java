package Strings;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        System.out.println(cellsInRange("K1:L2"));
    }

    public static List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        char r1 = s.charAt(1);
        char r2 = s.charAt(4);
        for (char i = c1; i <= c2; i++) {
            for (char j = r1; j <= r2; j++) {
                ans.add(""+i + j);
            }
        }
        return ans;
    }
}
