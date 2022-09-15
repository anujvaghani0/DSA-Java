package Strings;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String s, String goal) {
        String[] arr = new String[s.length()];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                ans.append(s.charAt(j));
            }
            for (int k = 0; k < i; k++) {
                ans.append(s.charAt(k));
            }
            arr[i] = ans.toString();
            ans.delete(0, ans.length());
        }
        for (int i = 0; i < arr.length; i++) {
            if (goal.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }
}
