package Strings;

public class ShiftingLetters {
    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {3, 5, 9};
        System.out.println(shiftingLetters(s, shifts));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        int previous = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {
            shifts[i] = (shifts[i] + previous) % 26;
            previous = shifts[i];
        }

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) ('a' + (((int) ch[i] + shifts[i]) % 'a') % 26);
        }
        return String.valueOf(ch);
    }
}
