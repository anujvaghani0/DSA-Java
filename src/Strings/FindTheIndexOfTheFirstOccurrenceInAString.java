package Strings;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needLength = needle.length();
        if (hayLength < needLength) {
            return -1;
        }

        for (int i = 0; i < hayLength - needLength; i++) {
            int j = 0;
            while (j < needLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}