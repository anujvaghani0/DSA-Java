package Strings;

public class AddingSpacesToAString {
    public static void main(String[] args) {
        int[] num = {8, 13, 15};
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", num));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int n = s.length() + spaces.length;
        int k = 0;
        int j = 0;
        int i = 0;
        while (k < n) {
            if (j < spaces.length && i == spaces[j]) {
                ans.append(' ');
                j++;
                k++;
            } else {
                ans.append(s.charAt(i));
                k++;
                i++;
            }
        }
        return ans.toString();
    }
}
