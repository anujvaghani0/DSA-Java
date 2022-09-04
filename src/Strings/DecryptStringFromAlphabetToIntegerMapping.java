package Strings;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length() - 2) {
            char ch;
            if (s.charAt(i + 2) == '#') {
                ch = (char) convert(s.substring(i, i + 2));
                i += 2;
            } else {
                ch = (char) convert(s.substring(i, i + 1));
            }
            i++;
            ans.append(ch);
        }
        while (i < s.length()) {
            char ch = (char) convert(s.substring(i, i + 1));
            ans.append(ch);
            i++;
        }
        return ans.toString();
    }

    public static int convert(String str) {
        int num = Integer.parseInt(str);
        return num + 96;
    }
}
