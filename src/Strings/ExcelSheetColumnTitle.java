package Strings;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            columnNumber /= 26;
            ans.append((char) ('A' + rem));
        }
        ans.reverse();
        return ans.toString();
    }
}
