package Strings;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int length = c.length;
        StringBuffer[] ans=new StringBuffer[numRows];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = new StringBuffer();
        }

        int i = 0;
        while (i < length) {
            for (int index = 0; index < numRows && i < length; index++) {
                ans[index].append(c[i++]);
            }
            for (int index = numRows-2; index >= 1 && i < length; index--) {
                ans[index].append(c[i++]);
            }
        }

        for (int index = 1; index < ans.length; index++) {
            ans[0].append(ans[index]);
        }
        return ans[0].toString();
    }
}