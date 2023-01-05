package Recursion.Premutation;

public class PermutationUsingRecursion {
    public static void main(String[] args) {
        permutation("", "1296");
    }

    public static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }
}
