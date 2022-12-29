package Strings;

// Question link -> https://leetcode.com/problems/best-poker-hand/

public class BestPokerHand {
    public static void main(String[] args) {
        int[] ranks = {13, 2, 3, 1, 9};
        char[] charater = {'a', 'a', 'a', 'a', 'a'};
        System.out.println(bestHand(ranks, charater));
    }

    public static String bestHand(int[] ranks, char[] suits) {
        int max = 0;
        int suit = 0;
        char ch = suits[0];
        int[] ans = new int[14];
        for (int i = 0; i < ranks.length; i++) {
            ans[ranks[i]]++;
            max = Math.max(max, ans[ranks[i]]);
            if (suits[i] == ch) {
                suit++;
            }
        }
        if (suit == 5) {
            return "Flush";
        }
        return max >= 3 ? "Three of a Kind" : (max == 2 ? "Pair" : "High Card");
    }
}
