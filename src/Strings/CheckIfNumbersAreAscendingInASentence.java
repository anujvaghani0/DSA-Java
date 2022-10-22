package Strings;

//question link -> https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/submissions/

public class CheckIfNumbersAreAscendingInASentence {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }

    public static boolean areNumbersAscending(String s) {
        String[] temp = s.split(" ");
        int second = 0;
        for (String i : temp) {
            if (Character.isDigit(i.charAt(0))) {
                int first = Integer.parseInt(i);
                if (first <= second) {
                    return false;
                } else {
                    second = first;
                }
            }
        }
        return true;
    }
}
