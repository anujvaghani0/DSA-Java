package Strings;

//question link -> https://leetcode.com/problems/the-number-of-full-rounds-you-have-played/

public class TheNumberofFullRoundsYouHavePlayed {
    public static void main(String[] args) {
        System.out.println(numberOfRounds("00:47", "00:57"));
    }


    public static int numberOfRounds(String loginTime, String logoutTime) {
        int startHH = Integer.parseInt((loginTime.substring(0, 2)));
        int startMM = Integer.parseInt((loginTime.substring(3)));
        int endHH = Integer.parseInt((logoutTime.substring(0, 2)));
        int endMM = Integer.parseInt((logoutTime.substring(3)));

        int start = startHH * 60 + startMM;
        int end = endHH * 60 + endMM;
        if (start > end) {
            end += 24 * 60;
        }
        int a = (int)Math.floor(end / 15.00);
        int b = (int) Math.ceil(start / 15.00);
        return Math.max(a - b, 0);
    }
}
