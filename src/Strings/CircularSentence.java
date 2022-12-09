package Strings;

// Question link -> https://leetcode.com/contest/weekly-contest-322/problems/circular-sentence/

public class CircularSentence {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] temp = sentence.split(" ");
        int size = temp.length;
        if (temp.length == 1) {
            if (temp[0].charAt(0) == temp[0].charAt(temp[0].length() - 1)) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < temp.length - 1; i++) {
            int n = temp[i].length();
            if (temp[i].charAt(n - 1) == temp[i + 1].charAt(0)) {
                continue;
            } else {
                return false;
            }

        }
        return temp[0].charAt(0) == (temp[size - 1].charAt(temp[size - 1].length() - 1));
    }
}