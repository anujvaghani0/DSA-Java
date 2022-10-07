package Strings;

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
    }

    public static String makeFancyString(String s) {
        char previous = s.charAt(0);
        StringBuilder ans = new StringBuilder();
        int frequency = 1;
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previous) {
                frequency++;
            } else {
                previous = s.charAt(i);
                frequency = 1;
            }
            if (frequency < 3) {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
