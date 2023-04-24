package Strings;

public class MinimumNumberOfMovesToMakePalindrome {
    public static void main(String[] args) {
        System.out.println(minMovesToMakePalindrome("skwhhaaunskegmdtutlgtteunmuuludii"));
    }

    public static int minMovesToMakePalindrome(String s) {
        int count = 0;
        while (s.length() > 2) {
            char ch1 = s.charAt(0);
            int length = s.length();
            char ch2 = s.charAt(length - 1);

            if (ch1 == ch2) {
                s = s.substring(1, length - 1);
            } else {
                int index1 = s.lastIndexOf(ch1);
                int index2 = s.indexOf(ch2);

                int steps1 = length - index1 - 1;
                int steps2 = index2;

                StringBuilder sb = new StringBuilder();

                if (steps1 > steps2) {
                    count += steps2;
                    sb.append(s, 0, index2);
                    sb.append(s, index2 + 1, length - 1);
                } else {
                    count += steps1;
                    sb.append(s, 1, index1);
                    sb.append(s.substring(index1 + 1));
                }
                s = sb.toString();
            }
        }
        return count;
    }
}
