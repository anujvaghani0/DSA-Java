package Strings;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s,arr));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            ans.setCharAt(indices[i], s.charAt(i));
        }
        return ans.toString();
    }
}