package Strings;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }

    public static String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            int firstIndex = i;
            while (i < n && ch[i] != ' ') {
                ch[i] = Character.toLowerCase(ch[i]);
                i++;
            }
            if (i - firstIndex > 2) {
                ch[firstIndex] = Character.toUpperCase(ch[firstIndex]);
            }
        }
        return String.valueOf(ch);
    }
}
