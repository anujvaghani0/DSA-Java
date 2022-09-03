package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int start = 0, end = 0;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (start > end) {
            return 0;
        }
        int position = end;
        while (position >= start) {
            if (s.charAt(position) == ' ') {
                return end - position;
            } else {
                position--;
            }
        }
        return end - position;
    }
}
