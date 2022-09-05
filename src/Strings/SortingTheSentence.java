package Strings;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] ans = new String[s.split(" ").length];
        for (String st : s.split(" ")) {
            ans[st.charAt(st.length() - 1) - '1'] = st.substring(0, st.length() - 1);
        }
        return String.join(" ", ans);
    }
}