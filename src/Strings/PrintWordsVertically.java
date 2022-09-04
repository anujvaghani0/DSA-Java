package Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        System.out.println(printVertically(s));
    }

    public static List<String> printVertically(String s) {
        String[] arr = s.split(" ");
        int length = arr.length;
        int maxLength = arr[0].length();
        for (int i = 1; i < length; i++) {
            int temp = arr[i].length();
            maxLength = Math.max(temp, maxLength);
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            StringBuilder temp1 = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (arr[j].length() > i) {
                    temp1.append(arr[j].charAt(i));
                } else {
                    temp1.append(" ");
                }
            }
//            ans.add(temp1.toString().replaceFirst("\\s+$", " "));
            ans.add(temp1.toString());
        }
        return ans;
    }
}
